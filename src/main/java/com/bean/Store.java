package com.bean;

public class Store {
    private Integer stoId;  //商店ID

    private String stoName; //商店名字

    private String stoType; //商店所属的大分类

    private String stoCity; //商店所在的城市

    private String stoClassify;//商店所属的小种类

    private String stoAddress;  //商店地址

    private Double stoPrice;//人均价格

    private String stoPicture; //商店图片

    private String stoTel;      //商店电话

    private String stoTime;     //营业时间

    private Integer sellerId;   //所属商家的ID

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