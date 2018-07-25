package com.bean;

public class Orders {
    private Integer oId;

    private String oName;

    private String oGoodsinfo;

    private String oMemberinfo;

    private String oData;

    private String oAddress;

    private String oRedit;

    private String oDelete;

    private String oAdd;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName == null ? null : oName.trim();
    }

    public String getoGoodsinfo() {
        return oGoodsinfo;
    }

    public void setoGoodsinfo(String oGoodsinfo) {
        this.oGoodsinfo = oGoodsinfo == null ? null : oGoodsinfo.trim();
    }

    public String getoMemberinfo() {
        return oMemberinfo;
    }

    public void setoMemberinfo(String oMemberinfo) {
        this.oMemberinfo = oMemberinfo == null ? null : oMemberinfo.trim();
    }

    public String getoData() {
        return oData;
    }

    public void setoData(String oData) {
        this.oData = oData == null ? null : oData.trim();
    }

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress == null ? null : oAddress.trim();
    }

    public String getoRedit() {
        return oRedit;
    }

    public void setoRedit(String oRedit) {
        this.oRedit = oRedit == null ? null : oRedit.trim();
    }

    public String getoDelete() {
        return oDelete;
    }

    public void setoDelete(String oDelete) {
        this.oDelete = oDelete == null ? null : oDelete.trim();
    }

    public String getoAdd() {
        return oAdd;
    }

    public void setoAdd(String oAdd) {
        this.oAdd = oAdd == null ? null : oAdd.trim();
    }
}