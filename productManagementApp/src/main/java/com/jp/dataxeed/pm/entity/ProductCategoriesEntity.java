package com.jp.dataxeed.pm.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProductCategoriesEntity {
    private Integer id;
    private Integer productId;
    private Integer categoryId;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
