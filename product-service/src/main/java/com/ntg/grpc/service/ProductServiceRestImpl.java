package com.ntg.grpc.service;

import com.ntg.grpc.dto.Order;
import com.ntg.grpc.exception.ProductServiceBusinessException;
import com.ntg.grpc.jpa.domain.Product;
import com.ntg.grpc.jpa.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@AllArgsConstructor
public class ProductServiceRestImpl {
    private final OrderFeignClient orderFeignClient;
    private final ProductRepository productRepository;
    public Product getProduct(Long id) {
        //Product product = null;
        log.info("Start Time  : " + new Date());
        log.info("ProductServiceRestImpl:getProducts execution started.");
        Product product=productRepository.findById(id).orElseThrow();
        log.info("End Time  : " + new Date());
        return product;
    }
    public Order getOrder(Long id) {
        //Product product = null;
        log.info("Start Time  : " + new Date());
        log.info("ProductServiceRestImpl:getProducts execution started.");
       Order  order=orderFeignClient.order(id);
        log.info("End Time  : " + new Date());
        return order;
    }
}
