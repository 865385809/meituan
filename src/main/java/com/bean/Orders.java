package com.bean;

import java.util.Date;

public class Orders {
    private Integer odrId;

    private String odrName;

    private String odrPhone;

    private String odrPaystate;

    private Date odrData;

    private String odrUserstate;

    private Double odrPrice;

    private String odrNumber;

    private Date paytime;

    private String godCount;

    private Integer godId;

    private Integer mbrId;

    private String isEvaluation;

    private String odrPicture;

    public Integer getOdrId() {
        return odrId;
    }

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public String getOdrName() {
        return odrName;
    }

    public void setOdrName(String odrName) {
        this.odrName = odrName == null ? null : odrName.trim();
    }

    public String getOdrPhone() {
        return odrPhone;
    }

    public void setOdrPhone(String odrPhone) {
        this.odrPhone = odrPhone == null ? null : odrPhone.trim();
    }

    public String getOdrPaystate() {
        return odrPaystate;
    }

    public void setOdrPaystate(String odrPaystate) {
        this.odrPaystate = odrPaystate == null ? null : odrPaystate.trim();
    }

    public Date getOdrData() {
        return odrData;
    }

    public void setOdrData(Date odrData) {
        this.odrData = odrData;
    }

    public String getOdrUserstate() {
        return odrUserstate;
    }

    public void setOdrUserstate(String odrUserstate) {
        this.odrUserstate = odrUserstate == null ? null : odrUserstate.trim();
    }

    public Double getOdrPrice() {
        return odrPrice;
    }

    public void setOdrPrice(Double odrPrice) {
        this.odrPrice = odrPrice;
    }

    public String getOdrNumber() {
        return odrNumber;
    }

    public void setOdrNumber(String odrNumber) {
        this.odrNumber = odrNumber == null ? null : odrNumber.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getGodCount() {
        return godCount;
    }

    public void setGodCount(String godCount) {
        this.godCount = godCount == null ? null : godCount.trim();
    }

    public Integer getGodId() {
        return godId;
    }

    public void setGodId(Integer godId) {
        this.godId = godId;
    }

    public Integer getMbrId() {
        return mbrId;
    }

    public void setMbrId(Integer mbrId) {
        this.mbrId = mbrId;
    }

    public String getIsEvaluation() {
        return isEvaluation;
    }

    public void setIsEvaluation(String isEvaluation) {
        this.isEvaluation = isEvaluation == null ? null : isEvaluation.trim();
    }

    public String getOdrPicture() {
        return odrPicture;
    }

    public void setOdrPicture(String odrPicture) {
        this.odrPicture = odrPicture == null ? null : odrPicture.trim();
    }
}