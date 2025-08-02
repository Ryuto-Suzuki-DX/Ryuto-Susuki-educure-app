package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.OrderEntity;

@Mapper
public interface OrderMapper {

    List<OrderEntity> findAll();

    OrderEntity findById(int id);

    void insertOrder(OrderEntity orderEntity);

    void updateOrderById(OrderEntity orderEntity);

    void deleteOrderById(int id);

}
