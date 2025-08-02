package com.jp.dataxeed.pm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jp.dataxeed.pm.entity.PartyEntity;

@Mapper
public interface PartyMapper {

    List<PartyEntity> findAll();

    PartyEntity findById();

    void insertParty(PartyEntity partyEntity);

    void updatePartyById(PartyEntity partyEntity);

    void deleteParyLogical(int id);
}
