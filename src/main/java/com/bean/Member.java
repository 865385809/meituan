package com.bean;

import javax.validation.constraints.Pattern;

public class Member {
    private Integer mId;    //会员
    @Pattern(regexp = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)"
            ,message = "用户名可以是2-5位中文或者6-16位英文和数字的组合")
    private String mUsername;   //会员名称

    @Pattern(regexp = "(^[a-zA-Z0-9_-]{6,18}$)"
            ,message = "密码6-18位英文和数字的组合不正确")
    private String mPassword;   //会员密码

    @Pattern(regexp = "(^[a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$"
            ,message = "邮箱格式不正确")
    private String mMailbox;    //会员邮箱

    @Pattern(regexp = "^1\\d{10}$"
            ,message = "手机的长度是以1开头的11位数字")
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