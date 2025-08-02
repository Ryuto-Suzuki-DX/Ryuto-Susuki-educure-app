package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.StockEntity;

@Mapper
public interface StockMapper {

    List<StockEntity> findAll();

    StockEntity findById(int id);

    void insertStock(StockEntity stockEntity);

    void updateStockById(StockEntity stockEntity);

    void deleteStockById(int id);

}
