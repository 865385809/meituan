package com.bean;

public class Goods {
    private Integer godId;

    private String godName;

    private Double godStoreprice;       //门店价

    private Integer godNumber;

    private Double godPrice;            //折后价

    private String godPicture;

    private String godDescription;

    private Integer storeId;

    public Integer getGodId() {
        return godId;
    }

    public void setGodId(Integer godId) {
        this.godId = godId;
    }

    public String getGodName() {
        return godName;
    }

    public void setGodName(String godName) {
        this.godName = godName == null ? null : godName.trim();
    }

    public Double getGodStoreprice() {
        return godStoreprice;
    }

    public void setGodStoreprice(Double godStoreprice) {
        this.godStoreprice = godStoreprice;
    }

    public Integer getGodNumber() {
        return godNumber;
    }

    public void setGodNumber(Integer godNumber) {
        this.godNumber = godNumber;
    }

    public Double getGodPrice() {
        return godPrice;
    }

    public void setGodPrice(Double godPrice) {
        this.godPrice = godPrice;
    }

    public String getGodPicture() {
        return godPicture;
    }

    public void setGodPicture(String godPicture) {
        this.godPicture = godPicture == null ? null : godPicture.trim();
    }

    public String getGodDescription() {
        return godDescription;
    }

    public void setGodDescription(String godDescription) {
        this.godDescription = godDescription == null ? null : godDescription.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}