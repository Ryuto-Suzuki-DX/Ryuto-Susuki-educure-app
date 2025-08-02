package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.ProductCategoriesEntity;

@Mapper
public interface ProductCategoriesMapper {

    List<ProductCategoriesEntity> findAll();

    ProductCategoriesEntity findById(int id);

    void insertProductCategories(ProductCategoriesEntity productCategoriesEntity);

    void updateProductCategoriesById(ProductCategoriesEntity productCategoriesEntity);

    void deleteProductCategoriesById(int id);
}
