package com.bean;

public class Store {
    private Integer stoId;

    private String stoName;

    private String stoType;

    private String stoCity;

    private String stoClassify;

    private String stoAddress;

    private Double stoPrice;

    private String stoPicture;

    private String stoTel;

    private String stoTime;

    private Integer sellerId;

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public String getStoName() {
        return stoName;
    }

    public void setStoName(String stoName) {
        this.stoName = stoName == null ? null : stoName.trim();
    }

    public String getStoType() {
        return stoType;
    }

    public void setStoType(String stoType) {
        this.stoType = stoType == null ? null : stoType.trim();
    }

    public String getStoCity() {
        return stoCity;
    }

    public void setStoCity(String stoCity) {
        this.stoCity = stoCity == null ? null : stoCity.trim();
    }

    public String getStoClassify() {
        return stoClassify;
    }

    public void setStoClassify(String stoClassify) {
        this.stoClassify = stoClassify == null ? null : stoClassify.trim();
    }

    public String getStoAddress() {
        return stoAddress;
    }

    public void setStoAddress(String stoAddress) {
        this.stoAddress = stoAddress == null ? null : stoAddress.trim();
    }

    public Double getStoPrice() {
        return stoPrice;
    }

    public void setStoPrice(Double stoPrice) {
        this.stoPrice = stoPrice;
    }

    public String getStoPicture() {
        return stoPicture;
    }

    public void setStoPicture(String stoPicture) {
        this.stoPicture = stoPicture == null ? null : stoPicture.trim();
    }

    public String getStoTel() {
        return stoTel;
    }

    public void setStoTel(String stoTel) {
        this.stoTel = stoTel == null ? null : stoTel.trim();
    }

    public String getStoTime() {
        return stoTime;
    }

    public void setStoTime(String stoTime) {
        this.stoTime = stoTime == null ? null : stoTime.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}