package com.bean;

public class Member {
    private Integer mId;    //会员

    private String mUsername;   //会员名称

    private String mPassword;   //会员密码

    private String mMailbox;    //会员邮箱

    private String mPhone;      //会员手机

    public Member() {
    }

    public Member(Integer mId, String mUsername, String mPassword, String mMailbox, String mPhone) {
        this.mId = mId;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mMailbox = mMailbox;
        this.mPhone = mPhone;
    }

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