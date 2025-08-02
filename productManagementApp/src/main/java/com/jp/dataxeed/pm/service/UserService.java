package com.jp.dataxeed.pm.service;

import com.jp.dataxeed.pm.Form.UserForm;
import com.jp.dataxeed.pm.Form.UserSearchForm;
import com.jp.dataxeed.pm.helper.UserHelper;
import com.jp.dataxeed.pm.mapper.UserMapper;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper userMapper;
    private final UserHelper userHelper;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserMapper userMapper, UserHelper userHelper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.userHelper = userHelper;
        this.passwordEncoder = passwordEncoder;
    }

    public List<UserForm> findAll() {
        return userMapper.findAll().stream()
                .map(userHelper::EntityToForm)
                .toList();
    }

    public List<UserForm> searchUsers(UserSearchForm form) {
        return userMapper.searchUsers(form).stream()
                .map(userHelper::EntityToForm)
                .toList();
    }
}
