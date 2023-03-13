package com.ntg.grpc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;

    private String productId;
    private BigDecimal totalPrice;

}
