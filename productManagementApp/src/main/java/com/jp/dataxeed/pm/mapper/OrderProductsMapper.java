package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.OrderProductsEntity;

@Mapper
public interface OrderProductsMapper {

    List<OrderProductsEntity> findAll();

    OrderProductsEntity findById(int id);

    void insertOrderProducts(OrderProductsEntity orderProductsEntity);

    void updateOrderProducts(OrderProductsEntity orderProductsEntity);

    void deleteOrderProductsById(int id);
}
