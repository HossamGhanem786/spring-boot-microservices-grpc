package com.ntg.grpc.handler;

import com.ntg.grpc.exception.ProductServiceBusinessException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class ProductServiceGrpcExceptionHandler {

    @GrpcExceptionHandler(ProductServiceBusinessException.class)
    public StatusRuntimeException handleValidationError(ProductServiceBusinessException exception) {


        return new StatusRuntimeException( Status.INTERNAL.withDescription(exception.getMessage()));
    }
}