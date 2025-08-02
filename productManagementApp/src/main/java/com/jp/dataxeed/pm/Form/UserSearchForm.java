package com.jp.dataxeed.pm.Form;

import lombok.Data;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

@Data
public class UserSearchForm {
    private Integer id;
    private String name;
    private String role;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate regDateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate regDateTo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate updDateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate updDateTo;
}
