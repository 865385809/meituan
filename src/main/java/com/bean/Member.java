package com.bean;

public class Member {
    private Integer mId;

    private String mUsername;

    private String mPassword;

    private String mMailbox;

    private String mPhone;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername == null ? null : mUsername.trim();
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword == null ? null : mPassword.trim();
    }

    public String getmMailbox() {
        return mMailbox;
    }

    public void setmMailbox(String mMailbox) {
        this.mMailbox = mMailbox == null ? null : mMailbox.trim();
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone == null ? null : mPhone.trim();
    }
}