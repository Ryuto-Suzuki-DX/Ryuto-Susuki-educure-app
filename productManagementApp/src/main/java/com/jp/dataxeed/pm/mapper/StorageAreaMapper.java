package com.jp.dataxeed.pm.mapper;

import com.jp.dataxeed.pm.entity.StorageAreaEntity;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageAreaMapper {

    List<StorageAreaEntity> findAll();

    StorageAreaEntity findById(int id);

    void insertStorageArea(StorageAreaEntity storageAreaEntity);

    void updateStorageAreaById(StorageAreaEntity storageAreaEntity);

    void deleteStorageAreaLogical(int id);

}
