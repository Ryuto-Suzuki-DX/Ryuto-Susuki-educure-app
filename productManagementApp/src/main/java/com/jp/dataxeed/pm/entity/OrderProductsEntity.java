package com.jp.dataxeed.pm.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderProductsEntity {
    private Integer id;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
