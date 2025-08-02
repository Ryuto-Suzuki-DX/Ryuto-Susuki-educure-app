package com.jp.dataxeed.pm.helper;

import org.springframework.stereotype.Service;

import com.jp.dataxeed.pm.Form.UserForm;
import com.jp.dataxeed.pm.entity.UserEntity;

@Service
public class UserHelper {

    public UserEntity FormToEntity(UserForm userForm) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userForm.getId());
        userEntity.setUsername(userForm.getUsername());
        userEntity.setName(userForm.getName());
        userEntity.setPassword(userForm.getPassword());
        userEntity.setRole(userForm.getRole());
        return userEntity;
    }

    public UserForm EntityToForm(UserEntity userEntity) {
        UserForm userForm = new UserForm();
        userForm.setId(userEntity.getId());
        userForm.setUsername(userEntity.getUsername());
        userForm.setName(userEntity.getName());
        userForm.setPassword(userEntity.getPassword());
        userForm.setRole(userEntity.getRole());
        return userForm;
    }
}
