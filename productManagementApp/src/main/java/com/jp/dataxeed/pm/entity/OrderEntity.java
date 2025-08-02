package com.jp.dataxeed.pm.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderEntity {
    private Integer id;
    private String orderCode;
    private Integer partyId;
    private String trackingNumber;
    private String adminNote;
    private String warehouseWorkerNote;
    private String qualityInspectorNote;
    private Integer warehouseWorkerId;
    private Integer qualityInspectorId;
    private Integer situation;
    private Integer temporaryHoldingAreaId;
    private Boolean deleteFlag;
    private LocalDate createdAt;
    private LocalDate upatedAt;
}
