package com.ntg.grpc.controller;

import com.google.protobuf.Message;
import com.ntg.grpc.OrderId;
import com.ntg.grpc.service.ProductServiceImpl;
import com.ntg.grpc.service.ProductServiceRestImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private ProductServiceRestImpl productServiceRest;

    private ProductServiceImpl productService;

    @GetMapping(value = "/order/{id}")
    public ResponseEntity<?> getOrder(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(productServiceRest.getOrder(id), HttpStatus.OK);
//        OrderId orderId= OrderId.newBuilder().setId(id.intValue()).build();
//        return new ResponseEntity<>(productService.getOrder(orderId), HttpStatus.OK);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getProduct(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
//        OrderId orderId= OrderId.newBuilder().setId(id.intValue()).build();
//        return new ResponseEntity<>(productService.getOrder(orderId), HttpStatus.OK);

    }

}
