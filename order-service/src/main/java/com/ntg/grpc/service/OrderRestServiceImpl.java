package com.ntg.grpc.service;

import com.ntg.grpc.jpa.domain.Order;
import com.ntg.grpc.jpa.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class OrderRestServiceImpl {

    private OrderRepository orderRepository;


    public Order getOrder(Long id) {
        return orderRepository.findById(id).get();
    }

}
