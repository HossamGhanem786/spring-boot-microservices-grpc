package com.ntg.grpc.handler;

import com.ntg.grpc.exception.OrderServiceBusinessException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;
@GrpcAdvice
public class OrderServiceGrpcExceptionHandler {

    @GrpcExceptionHandler(OrderServiceBusinessException.class)
    public StatusRuntimeException handleValidationError(OrderServiceBusinessException exception) {


        return new StatusRuntimeException( Status.INTERNAL.withDescription(exception.getMessage()));
    }
}