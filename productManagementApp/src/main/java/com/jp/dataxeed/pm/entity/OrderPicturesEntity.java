package com.jp.dataxeed.pm.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class OrderPicturesEntity {
    private Integer id;
    private Integer orderId;
    private Integer pictureId;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
