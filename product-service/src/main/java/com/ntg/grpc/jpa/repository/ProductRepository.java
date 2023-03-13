package com.ntg.grpc.jpa.repository;

import com.ntg.grpc.jpa.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
