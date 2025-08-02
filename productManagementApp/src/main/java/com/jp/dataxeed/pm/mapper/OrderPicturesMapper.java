package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.OrderPicturesEntity;

@Mapper
public interface OrderPicturesMapper {

    List<OrderPicturesEntity> findAll();

    OrderPicturesEntity findById(int id);

    void insertOrderProducts(OrderPicturesEntity orderPicturesEntity);

    void updateOrderProductsById(OrderPicturesEntity orderPicturesEntity);

    void deleteOrderProductsById(int id);
}
