package com.bean;

public class Comments {
    private Integer comId;

    private String comContext;

    private String comTitle;

    private Integer goodsId;

    private Integer storeId;

    private Integer memberId;

    private String comPicture;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComContext() {
        return comContext;
    }

    public void setComContext(String comContext) {
        this.comContext = comContext == null ? null : comContext.trim();
    }

    public String getComTitle() {
        return comTitle;
    }

    public void setComTitle(String comTitle) {
        this.comTitle = comTitle == null ? null : comTitle.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getComPicture() {
        return comPicture;
    }

    public void setComPicture(String comPicture) {
        this.comPicture = comPicture == null ? null : comPicture.trim();
    }
}