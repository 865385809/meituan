package com.bean;

public class City {
    private Integer ciId;

    private String ciNumber;

    private String ciName;

    private String ciBelong;

    public Integer getCiId() {
        return ciId;
    }

    public void setCiId(Integer ciId) {
        this.ciId = ciId;
    }

    public String getCiNumber() {
        return ciNumber;
    }

    public void setCiNumber(String ciNumber) {
        this.ciNumber = ciNumber == null ? null : ciNumber.trim();
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName == null ? null : ciName.trim();
    }

    public String getCiBelong() {
        return ciBelong;
    }

    public void setCiBelong(String ciBelong) {
        this.ciBelong = ciBelong == null ? null : ciBelong.trim();
    }
}