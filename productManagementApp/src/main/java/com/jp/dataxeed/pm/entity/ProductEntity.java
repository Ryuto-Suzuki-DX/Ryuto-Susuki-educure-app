package com.jp.dataxeed.pm.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProductEntity {
    private Integer id;
    private String productCode;
    private String name;
    private Boolean deleteFlag;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
