package com.ntg.grpc.service;

import com.ntg.grpc.*;
import com.ntg.grpc.exception.OrderServiceBusinessException;
import com.ntg.grpc.jpa.domain.Order;
import com.ntg.grpc.jpa.repository.OrderRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Slf4j
@GrpcService
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void placeOrder(OrderRequest request, StreamObserver<OrderResponse2> responseObserver) {

        log.info("OrderServiceImpl:placeOrder execution started.");
        try {

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 44441).usePlaintext().build();
            ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);
            Id id = Id.newBuilder().setId(String.valueOf(request.getProductId())).build();
            Order order = Order.builder().productId(String.valueOf(request.getProductId())).build();
            orderRepository.save(order);
            ProductResponse productResponse = stub.findOne(id);
            order.setTotalPrice(new BigDecimal(productResponse.getPrice()).multiply(BigDecimal.valueOf(request.getQuantity())));
            orderRepository.save(order);
            OrderResponse2 orderResponse = OrderResponse2.newBuilder().setOrderId(order.getId().intValue()).setTotalPrice(order.getTotalPrice().intValue()).build();
            channel.shutdown();
            responseObserver.onNext(orderResponse);
            responseObserver.onCompleted();
        } catch (Exception exception) {
            log.error("Exception occurred while persisting order to database , Exception message {}", exception.getMessage());
            throw new OrderServiceBusinessException("Exception occurred while create a new order");
        }
        log.info("OrderService:placeOrder execution ended.");

    }


}
