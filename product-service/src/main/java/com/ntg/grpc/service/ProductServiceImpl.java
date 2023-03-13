package com.ntg.grpc.service;

import com.google.protobuf.Empty;
import com.ntg.grpc.*;
import com.ntg.grpc.dto.Order;
import com.ntg.grpc.exception.ProductServiceBusinessException;
import com.ntg.grpc.jpa.domain.Product;
import com.ntg.grpc.jpa.repository.ProductRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@GrpcService
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {
    @GrpcClient("orderService")
    ProductServiceGrpc.ProductServiceBlockingStub stub;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();
        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
                .setMessage("Received your " + message + ". Hello From Server. ")
                .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void addProduct(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        String name = request.getName();
        System.out.println("Received Name: " + name);
        Product product = Product.builder()
                .name(request.getName())
                .price(new BigDecimal(request.getPrice()))
                .type(request.getType())
                .build();
        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
        ProductResponse productResponse = ProductResponse.newBuilder()
                .setId(String.valueOf(product.getId()))
                .setName(product.getName())
                .setType(product.getType())
                .setPrice(request.getPrice())
                .build();

        responseObserver.onNext(productResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void products(Empty request, StreamObserver<ProductResponse> responseObserver) {
        log.info("Start Time  : " + new Date());
        log.info("ProductServiceImpl:getProducts execution started.");
        ProductResponse productResponse = null;
        try {

            List<Product> products = productRepository.findAll();
            for(Product product:products){
                productResponse = ProductResponse.newBuilder()
                        .setPrice(String.valueOf(product.getPrice()))
                        .setName(product.getName())
                        .setType(product.getType())
                        .build();
                responseObserver.onNext(productResponse);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (Exception ex) {
            responseObserver.onError(ex);
        }
        log.info("End Time : " + new Date());

        responseObserver.onCompleted();
    }

    @Override
    public void productPage(PaginationRequest request, StreamObserver<ProductPageResponse> responseObserver) {
        log.info("Start Time  : " + new Date());
        log.info("ProductServiceImpl:getProducts execution started.");
        ProductPageResponse pageResponse = null;
        try {
            int pageNumber = request.getPage();
            log.info("Page Number {} is saved", pageNumber);
            Pageable pageRequest = PageRequest.of(request.getPage(), request.getSize());
            Page<Product> page = productRepository.findAll(pageRequest);
            log.info("Total Elements {} ", page.getTotalElements());
            pageResponse = ProductPageResponse.newBuilder()
                    .addAllProductResponse(mapProduct(page.getContent()))
                    .setSize(page.getSize())
                    .setTotalElements((int) page.getTotalElements())
                    .setIsFirst(true)
                    .setIsLast(true)
                    .setTotalPages(page.getTotalPages())
                    .build();
        } catch (Exception ex) {
            responseObserver.onError(ex);
        }
        responseObserver.onNext(pageResponse);
        log.info("End Time : " + new Date());

        responseObserver.onCompleted();
    }

    @Override
    public void findOne(Id request, StreamObserver<ProductResponse> responseObserver) {
        log.info("Product  id {} ", request.getId());
        ProductResponse productResponse = null;
        Optional<Product> product = productRepository.findById(Long.valueOf(request.getId()));
        if (product.isPresent()) {
            productResponse = ProductResponse.newBuilder()
                    .setId(String.valueOf(product.get().getId()))
                    .setName(product.get().getName())
                    .setType(product.get().getType())
                    .setPrice(String.valueOf(product.get().getPrice()))
                    .build();
        } else {
            log.error("Product with  id {}  not found", request.getId());
            responseObserver.onError(new StatusRuntimeException(Status.NOT_FOUND.withDescription("Product with  id: " + request.getId() + "  not found")));
            responseObserver.onCompleted();
        }
        log.info("Product with  id {}  retrieved successfully", request.getId());
        responseObserver.onNext(productResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteOne(Id request, StreamObserver<GreetingResponse> responseObserver) {

        log.info("Product  id {} ", request.getId());

        Boolean isAvailable = productRepository.existsById(Long.valueOf(request.getId()));
        if (isAvailable) {
            productRepository.deleteById(Long.valueOf(request.getId()));
        } else {
            log.error("Product with  id {}  not found", request.getId());
            GreetingResponse greetingResponse = GreetingResponse.newBuilder()
                    .setMessage("Product with  id: " + request.getId() + "  not found")
                    .build();
            responseObserver.onNext(greetingResponse);
            responseObserver.onCompleted();
        }
        log.info("Product with  id {}  deleted successfully", request.getId());

        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
                .setMessage("Product with  id: " + request.getId() + "  deleted successfully")
                .build();
        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }

    private List<ProductResponse> mapProduct(List<Product> content) {
        List<ProductResponse> productResponses = new ArrayList<>();

        for (Product product : content) {
            productResponses.add(ProductResponse.newBuilder()
                    .setId(String.valueOf(product.getId()))
                    .setName(product.getName())
                    .setType(product.getType()).build());
        }
        return productResponses;
    }

    @Override
    public void order(OrderId request, StreamObserver<OrderResponse> responseObserver) {

        log.info("ProductServiceImpl:placeOrder execution started.");
        try {
            log.info("Start Time  : " + new Date());
            OrderId id = OrderId.newBuilder().setId(request.getId()).build();
            OrderResponse order = stub.order(id);
            log.info("End Time  : " + new Date());

            responseObserver.onNext(order);
            responseObserver.onCompleted();
        } catch (Exception exception) {
            log.error("Exception occurred while persisting order to database , Exception message {}", exception.getMessage());
            throw new ProductServiceBusinessException("Exception occurred while create a new order");
        }
        log.info("ProductService:placeOrder execution ended.");

    }

    public Order getOrder(OrderId orderId){
      OrderResponse orderResponse=    stub.order(orderId);
      return Order.builder().id(Long.valueOf(orderResponse.getOrderId())).productId(String.valueOf(orderResponse.getOrderId())).totalPrice(BigDecimal.valueOf(orderResponse.getTotalPrice())).build();
    }

    public Product getProduct(Long id){

       return  productRepository.findById(Long.valueOf(id)).get();
    }
}
