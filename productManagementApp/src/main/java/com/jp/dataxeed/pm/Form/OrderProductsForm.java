package com.jp.dataxeed.pm.Form;

import lombok.Data;

@Data
public class OrderProductsForm {
    private Integer id;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
}
