package com.bean;

public class Country {
    private Integer coId;

    private String coName;

    private String coBelong;

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName == null ? null : coName.trim();
    }

    public String getCoBelong() {
        return coBelong;
    }

    public void setCoBelong(String coBelong) {
        this.coBelong = coBelong == null ? null : coBelong.trim();
    }
}