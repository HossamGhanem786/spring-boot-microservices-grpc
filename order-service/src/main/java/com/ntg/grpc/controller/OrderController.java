package com.ntg.grpc.controller;

import com.ntg.grpc.service.OrderRestServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private OrderRestServiceImpl orderRestService;
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrder(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(orderRestService.getOrder(id), HttpStatus.OK);
    }

}
