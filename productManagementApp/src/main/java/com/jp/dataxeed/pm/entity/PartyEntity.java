package com.jp.dataxeed.pm.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PartyEntity {
    private Integer id;
    private String partyCord;
    private String name;
    private String address;
    private String detail;
    private String attention;
    private Boolean deleteFlag;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
