package com.ntg.grpc.jpa.repository;

import com.ntg.grpc.jpa.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
