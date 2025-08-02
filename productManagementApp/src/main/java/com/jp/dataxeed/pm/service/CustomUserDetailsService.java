package com.jp.dataxeed.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.dataxeed.pm.entity.UserEntity;
import com.jp.dataxeed.pm.mapper.UserMapper;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserMapper userMapper;

    @Autowired
    public CustomUserDetailsService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userMapper.findByUsername(username);

        if (userEntity == null) {
            throw new UsernameNotFoundException("User not found:" + username);
        }

        return User
                .withUsername(userEntity.getUsername())
                // ここを修正しました。パスワードに{noop}を付けずにそのまま返します。
                .password(userEntity.getPassword())
                .roles(userEntity.getRole())
                .build();

    }
}
