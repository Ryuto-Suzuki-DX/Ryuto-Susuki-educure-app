package com.jp.dataxeed.pm.Form;

import lombok.Data;

@Data
public class UserForm {
    private Integer id;
    private String username;
    private String name;
    private String password;
    private String role;
}
