package com.ntg.grpc.service;

import com.ntg.grpc.dto.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "orderFeignClient", url = "http://localhost:55552/api/order")
public interface OrderFeignClient {

    @GetMapping(value = "/{id}")
    Order order(@PathVariable("id") Long id);
}