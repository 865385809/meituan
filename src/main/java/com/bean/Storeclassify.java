package com.bean;

public class Storeclassify {
    private Integer scId;

    private String scName;

    private String scBelong;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public String getScBelong() {
        return scBelong;
    }

    public void setScBelong(String scBelong) {
        this.scBelong = scBelong == null ? null : scBelong.trim();
    }
}