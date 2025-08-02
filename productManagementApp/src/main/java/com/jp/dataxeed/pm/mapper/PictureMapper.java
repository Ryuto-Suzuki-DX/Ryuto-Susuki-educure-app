package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.PictureEntity;

@Mapper
public interface PictureMapper {

    List<PictureEntity> findAll();

    PictureEntity findById(int id);

    void insertPicture(PictureEntity pictureEntity);

    void updatePictureById(PictureEntity pictureEntity);

    void deletePictureById(int id);

}
