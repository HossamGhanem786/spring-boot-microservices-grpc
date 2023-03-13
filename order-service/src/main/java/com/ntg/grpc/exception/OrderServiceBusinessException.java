package com.ntg.grpc.exception;

public class OrderServiceBusinessException extends RuntimeException{
    public OrderServiceBusinessException(String message) {
        super(message);
    }
}
