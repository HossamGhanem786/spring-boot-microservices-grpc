package com.ntg.grpc.exception;

public class ProductServiceBusinessException extends RuntimeException{
    public ProductServiceBusinessException(String message) {
        super(message);
    }
}
