package com.jp.dataxeed.pm.mapper;

import com.jp.dataxeed.pm.Form.UserSearchForm;
import com.jp.dataxeed.pm.entity.UserEntity;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    List<UserEntity> findAll();

    UserEntity findById(int id);

    UserEntity findByUsername(String username);

    int insertUser(UserEntity userEntity);

    int updateUserById(UserEntity userEntity);

    int deleteUserLogical(int id);

    List<UserEntity> searchUsers(UserSearchForm form);

}
