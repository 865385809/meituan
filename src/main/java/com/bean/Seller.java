package com.bean;

public class Seller {
    private Integer sId;

    private String sUsername;

    private String sPassword;

    private String sMailbox;

    private String sPhone;

    private String sName;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        this.sUsername = sUsername == null ? null : sUsername.trim();
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public String getsMailbox() {
        return sMailbox;
    }

    public void setsMailbox(String sMailbox) {
        this.sMailbox = sMailbox == null ? null : sMailbox.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }
}