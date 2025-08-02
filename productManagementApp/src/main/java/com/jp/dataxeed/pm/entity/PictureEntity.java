package com.jp.dataxeed.pm.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PictureEntity {
    private Integer id;
    private String name;
    private String fileType;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
