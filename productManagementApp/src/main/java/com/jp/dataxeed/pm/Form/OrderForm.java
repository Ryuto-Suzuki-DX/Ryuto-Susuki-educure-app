package com.jp.dataxeed.pm.Form;

import lombok.Data;

@Data
public class OrderForm {
    private Integer id;
    private String orderCode;
    private Integer partyId;
    private String trackingNumber;
    private String adminNote;
    private String warehouseWorkerNote;
    private String qualiryInspectorNote;
    private Integer situation;
    private Integer temporaryHoldingAreaId;
}
