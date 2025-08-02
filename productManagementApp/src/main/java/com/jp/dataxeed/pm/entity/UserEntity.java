package com.jp.dataxeed.pm.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserEntity {
    private Integer id;
    private String username;
    private String name;
    private String password;
    private String role;
    private Boolean deleteFlag;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}