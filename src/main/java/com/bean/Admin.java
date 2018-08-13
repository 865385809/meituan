package com.bean;

public class Admin {
    private Integer admId;

    private String admUsername;

    private String admPassword;

    private String admName;

    public Integer getAdmId() {
        return admId;
    }

    public void setAdmId(Integer admId) {
        this.admId = admId;
    }

    public String getAdmUsername() {
        return admUsername;
    }

    public void setAdmUsername(String admUsername) {
        this.admUsername = admUsername == null ? null : admUsername.trim();
    }

    public String getAdmPassword() {
        return admPassword;
    }

    public void setAdmPassword(String admPassword) {
        this.admPassword = admPassword == null ? null : admPassword.trim();
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName == null ? null : admName.trim();
    }
}