package com.ntg.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "com.ntg.grpc.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ntg.grpc.GreetingRequest,
      com.ntg.grpc.GreetingResponse> getGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting",
      requestType = com.ntg.grpc.GreetingRequest.class,
      responseType = com.ntg.grpc.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ntg.grpc.GreetingRequest,
      com.ntg.grpc.GreetingResponse> getGreetingMethod() {
    io.grpc.MethodDescriptor<com.ntg.grpc.GreetingRequest, com.ntg.grpc.GreetingResponse> getGreetingMethod;
    if ((getGreetingMethod = ProductServiceGrpc.getGreetingMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGreetingMethod = ProductServiceGrpc.getGreetingMethod) == null) {
          ProductServiceGrpc.getGreetingMethod = getGreetingMethod =
              io.grpc.MethodDescriptor.<com.ntg.grpc.GreetingRequest, com.ntg.grpc.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("greeting"))
              .build();
        }
      }
    }
    return getGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ntg.grpc.ProductRequest,
      com.ntg.grpc.ProductResponse> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProduct",
      requestType = com.ntg.grpc.ProductRequest.class,
      responseType = com.ntg.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ntg.grpc.ProductRequest,
      com.ntg.grpc.ProductResponse> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.ntg.grpc.ProductRequest, com.ntg.grpc.ProductResponse> getAddProductMethod;
    if ((getAddProductMethod = ProductServiceGrpc.getAddProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getAddProductMethod = ProductServiceGrpc.getAddProductMethod) == null) {
          ProductServiceGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<com.ntg.grpc.ProductRequest, com.ntg.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("addProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ntg.grpc.Id,
      com.ntg.grpc.ProductResponse> getFindOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findOne",
      requestType = com.ntg.grpc.Id.class,
      responseType = com.ntg.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ntg.grpc.Id,
      com.ntg.grpc.ProductResponse> getFindOneMethod() {
    io.grpc.MethodDescriptor<com.ntg.grpc.Id, com.ntg.grpc.ProductResponse> getFindOneMethod;
    if ((getFindOneMethod = ProductServiceGrpc.getFindOneMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFindOneMethod = ProductServiceGrpc.getFindOneMethod) == null) {
          ProductServiceGrpc.getFindOneMethod = getFindOneMethod =
              io.grpc.MethodDescriptor.<com.ntg.grpc.Id, com.ntg.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("findOne"))
              .build();
        }
      }
    }
    return getFindOneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.ntg.grpc.ProductResponse> getProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "products",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.ntg.grpc.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.ntg.grpc.ProductResponse> getProductsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.ntg.grpc.ProductResponse> getProductsMethod;
    if ((getProductsMethod = ProductServiceGrpc.getProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getProductsMethod = ProductServiceGrpc.getProductsMethod) == null) {
          ProductServiceGrpc.getProductsMethod = getProductsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.ntg.grpc.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "products"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("products"))
              .build();
        }
      }
    }
    return getProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ntg.grpc.Id,
      com.ntg.grpc.GreetingResponse> getDeleteOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOne",
      requestType = com.ntg.grpc.Id.class,
      responseType = com.ntg.grpc.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ntg.grpc.Id,
      com.ntg.grpc.GreetingResponse> getDeleteOneMethod() {
    io.grpc.MethodDescriptor<com.ntg.grpc.Id, com.ntg.grpc.GreetingResponse> getDeleteOneMethod;
    if ((getDeleteOneMethod = ProductServiceGrpc.getDeleteOneMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteOneMethod = ProductServiceGrpc.getDeleteOneMethod) == null) {
          ProductServiceGrpc.getDeleteOneMethod = getDeleteOneMethod =
              io.grpc.MethodDescriptor.<com.ntg.grpc.Id, com.ntg.grpc.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("deleteOne"))
              .build();
        }
      }
    }
    return getDeleteOneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ntg.grpc.PaginationRequest,
      com.ntg.grpc.ProductPageResponse> getProductPageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "productPage",
      requestType = com.ntg.grpc.PaginationRequest.class,
      responseType = com.ntg.grpc.ProductPageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ntg.grpc.PaginationRequest,
      com.ntg.grpc.ProductPageResponse> getProductPageMethod() {
    io.grpc.MethodDescriptor<com.ntg.grpc.PaginationRequest, com.ntg.grpc.ProductPageResponse> getProductPageMethod;
    if ((getProductPageMethod = ProductServiceGrpc.getProductPageMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getProductPageMethod = ProductServiceGrpc.getProductPageMethod) == null) {
          ProductServiceGrpc.getProductPageMethod = getProductPageMethod =
              io.grpc.MethodDescriptor.<com.ntg.grpc.PaginationRequest, com.ntg.grpc.ProductPageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "productPage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.PaginationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.ProductPageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("productPage"))
              .build();
        }
      }
    }
    return getProductPageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ntg.grpc.OrderId,
      com.ntg.grpc.OrderResponse> getOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "order",
      requestType = com.ntg.grpc.OrderId.class,
      responseType = com.ntg.grpc.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ntg.grpc.OrderId,
      com.ntg.grpc.OrderResponse> getOrderMethod() {
    io.grpc.MethodDescriptor<com.ntg.grpc.OrderId, com.ntg.grpc.OrderResponse> getOrderMethod;
    if ((getOrderMethod = ProductServiceGrpc.getOrderMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getOrderMethod = ProductServiceGrpc.getOrderMethod) == null) {
          ProductServiceGrpc.getOrderMethod = getOrderMethod =
              io.grpc.MethodDescriptor.<com.ntg.grpc.OrderId, com.ntg.grpc.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "order"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.OrderId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ntg.grpc.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("order"))
              .build();
        }
      }
    }
    return getOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting(com.ntg.grpc.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.GreetingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetingMethod(), responseObserver);
    }

    /**
     */
    public void addProduct(com.ntg.grpc.ProductRequest request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     */
    public void findOne(com.ntg.grpc.Id request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindOneMethod(), responseObserver);
    }

    /**
     */
    public void products(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductsMethod(), responseObserver);
    }

    /**
     */
    public void deleteOne(com.ntg.grpc.Id request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.GreetingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOneMethod(), responseObserver);
    }

    /**
     */
    public void productPage(com.ntg.grpc.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductPageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductPageMethod(), responseObserver);
    }

    /**
     * <pre>
     *  rpc checkHealth(google.protobuf.Empty) returns (GreetingResponse){}
     * </pre>
     */
    public void order(com.ntg.grpc.OrderId request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.OrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ntg.grpc.GreetingRequest,
                com.ntg.grpc.GreetingResponse>(
                  this, METHODID_GREETING)))
          .addMethod(
            getAddProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ntg.grpc.ProductRequest,
                com.ntg.grpc.ProductResponse>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            getFindOneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ntg.grpc.Id,
                com.ntg.grpc.ProductResponse>(
                  this, METHODID_FIND_ONE)))
          .addMethod(
            getProductsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.ntg.grpc.ProductResponse>(
                  this, METHODID_PRODUCTS)))
          .addMethod(
            getDeleteOneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ntg.grpc.Id,
                com.ntg.grpc.GreetingResponse>(
                  this, METHODID_DELETE_ONE)))
          .addMethod(
            getProductPageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ntg.grpc.PaginationRequest,
                com.ntg.grpc.ProductPageResponse>(
                  this, METHODID_PRODUCT_PAGE)))
          .addMethod(
            getOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ntg.grpc.OrderId,
                com.ntg.grpc.OrderResponse>(
                  this, METHODID_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void greeting(com.ntg.grpc.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.GreetingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProduct(com.ntg.grpc.ProductRequest request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findOne(com.ntg.grpc.Id request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void products(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOne(com.ntg.grpc.Id request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.GreetingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productPage(com.ntg.grpc.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.ProductPageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductPageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc checkHealth(google.protobuf.Empty) returns (GreetingResponse){}
     * </pre>
     */
    public void order(com.ntg.grpc.OrderId request,
        io.grpc.stub.StreamObserver<com.ntg.grpc.OrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ntg.grpc.GreetingResponse greeting(com.ntg.grpc.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ntg.grpc.ProductResponse addProduct(com.ntg.grpc.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ntg.grpc.ProductResponse findOne(com.ntg.grpc.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOneMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ntg.grpc.ProductResponse> products(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ntg.grpc.GreetingResponse deleteOne(com.ntg.grpc.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ntg.grpc.ProductPageResponse productPage(com.ntg.grpc.PaginationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductPageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc checkHealth(google.protobuf.Empty) returns (GreetingResponse){}
     * </pre>
     */
    public com.ntg.grpc.OrderResponse order(com.ntg.grpc.OrderId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntg.grpc.GreetingResponse> greeting(
        com.ntg.grpc.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntg.grpc.ProductResponse> addProduct(
        com.ntg.grpc.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntg.grpc.ProductResponse> findOne(
        com.ntg.grpc.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntg.grpc.GreetingResponse> deleteOne(
        com.ntg.grpc.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntg.grpc.ProductPageResponse> productPage(
        com.ntg.grpc.PaginationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductPageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc checkHealth(google.protobuf.Empty) returns (GreetingResponse){}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntg.grpc.OrderResponse> order(
        com.ntg.grpc.OrderId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;
  private static final int METHODID_ADD_PRODUCT = 1;
  private static final int METHODID_FIND_ONE = 2;
  private static final int METHODID_PRODUCTS = 3;
  private static final int METHODID_DELETE_ONE = 4;
  private static final int METHODID_PRODUCT_PAGE = 5;
  private static final int METHODID_ORDER = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.ntg.grpc.GreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.ntg.grpc.GreetingResponse>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.ntg.grpc.ProductRequest) request,
              (io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_FIND_ONE:
          serviceImpl.findOne((com.ntg.grpc.Id) request,
              (io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_PRODUCTS:
          serviceImpl.products((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.ntg.grpc.ProductResponse>) responseObserver);
          break;
        case METHODID_DELETE_ONE:
          serviceImpl.deleteOne((com.ntg.grpc.Id) request,
              (io.grpc.stub.StreamObserver<com.ntg.grpc.GreetingResponse>) responseObserver);
          break;
        case METHODID_PRODUCT_PAGE:
          serviceImpl.productPage((com.ntg.grpc.PaginationRequest) request,
              (io.grpc.stub.StreamObserver<com.ntg.grpc.ProductPageResponse>) responseObserver);
          break;
        case METHODID_ORDER:
          serviceImpl.order((com.ntg.grpc.OrderId) request,
              (io.grpc.stub.StreamObserver<com.ntg.grpc.OrderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ntg.grpc.Product.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGreetingMethod())
              .addMethod(getAddProductMethod())
              .addMethod(getFindOneMethod())
              .addMethod(getProductsMethod())
              .addMethod(getDeleteOneMethod())
              .addMethod(getProductPageMethod())
              .addMethod(getOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
