package com.ntg.grpc.service;

import com.ntg.grpc.OrderId;
import com.ntg.grpc.OrderResponse;
import com.ntg.grpc.ProductServiceGrpc;
import com.ntg.grpc.jpa.domain.Order;
import com.ntg.grpc.jpa.repository.OrderRepository;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Optional;

@Slf4j
@GrpcService
@AllArgsConstructor
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {
    private OrderRepository orderRepository;

    @Override
    public void order(OrderId request, StreamObserver<OrderResponse> responseObserver) {
        {
            log.info("Order  id {} ", request.getId());
            OrderResponse orderResponse = null;
            Optional<Order> order = orderRepository.findById(Long.valueOf(request.getId()));
            if (order.isPresent()) {
                orderResponse = OrderResponse.newBuilder()
                        .setOrderId(order.get().getId().intValue())
                        .setTotalPrice(order.get().getTotalPrice().intValue()).build();
            } else {
                log.error("Order with  id {}  not found", request.getId());
                responseObserver.onError(new StatusRuntimeException(Status.NOT_FOUND.withDescription("Product with  id: " + request.getId() + "  not found")));
                responseObserver.onCompleted();
            }
            log.info("Order with  id {}  retrieved successfully", request.getId());
            responseObserver.onNext(orderResponse);
            responseObserver.onCompleted();
        }

    }
}
