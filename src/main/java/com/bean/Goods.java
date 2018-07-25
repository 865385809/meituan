package com.bean;

public class Goods {
    private Integer gId;

    private String gName;

    private Double gSprice;

    private Integer gNumber;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Double getgSprice() {
        return gSprice;
    }

    public void setgSprice(Double gSprice) {
        this.gSprice = gSprice;
    }

    public Integer getgNumber() {
        return gNumber;
    }

    public void setgNumber(Integer gNumber) {
        this.gNumber = gNumber;
    }
}