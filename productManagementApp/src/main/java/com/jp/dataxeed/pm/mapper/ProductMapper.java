package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.ProductEntity;

@Mapper
public interface ProductMapper {

    List<ProductEntity> findAll();

    ProductEntity findById(int id);

    void insertProduct(ProductEntity productEntity);

    void updateProductById(ProductEntity productEntity);

    void deleteProductById(int id);

}
