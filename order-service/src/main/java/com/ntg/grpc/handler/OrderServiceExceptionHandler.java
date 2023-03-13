package com.ntg.grpc.handler;

import com.ntg.grpc.dto.APIResponse;
import com.ntg.grpc.dto.ErrorDTO;
import com.ntg.grpc.exception.OrderServiceBusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;

@RestControllerAdvice
public class OrderServiceExceptionHandler {
    @ExceptionHandler(OrderServiceBusinessException.class)
    public APIResponse<?> handleServiceException(OrderServiceBusinessException exception) {
        APIResponse<?> serviceResponse = new APIResponse<>();
        serviceResponse.setStatus("FAILED");
        serviceResponse.setErrors(Collections.singletonList(new ErrorDTO("", exception.getMessage())));
        return serviceResponse;
    }
}
