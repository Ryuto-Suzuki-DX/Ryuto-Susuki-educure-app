package com.jp.dataxeed.pm.Form;

import lombok.Data;

@Data
public class PartyForm {
    private Integer id;
    private String partyCode;
    private String name;
    private String address;
    private String detail;
    private String attention;
}
