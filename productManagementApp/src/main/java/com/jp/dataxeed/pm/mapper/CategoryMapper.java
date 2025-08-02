package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.CategoryEntity;

@Mapper
public interface CategoryMapper {

    List<CategoryEntity> findAll();

    CategoryEntity findById();

    void insertCategory(CategoryEntity categoryEntity);

    void updateCategoryById(CategoryEntity categoryEntity);

    void deleteCategoryLogical(int id);

}
