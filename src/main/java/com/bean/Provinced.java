package com.bean;

public class Provinced {
    private Integer prId;

    private String prNumber;

    private String prName;

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public String getPrNumber() {
        return prNumber;
    }

    public void setPrNumber(String prNumber) {
        this.prNumber = prNumber == null ? null : prNumber.trim();
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName == null ? null : prName.trim();
    }
}