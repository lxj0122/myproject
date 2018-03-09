package com.ssm.entity.user;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/2/9
 * Time: 15:32
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1753934078071726878L;
    private long userId;
    private String userName;
    private String userPwd;
    private String userMobile;
    private String userCreatedOn;
    private String userLastLoginOn;
    private String userSex;
    private String qq;
    private String userMail;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserCreatedOn() {
        return userCreatedOn;
    }

    public void setUserCreatedOn(String userCreatedOn) {
        this.userCreatedOn = userCreatedOn;
    }

    public String getUserLastLoginOn() {
        return userLastLoginOn;
    }

    public void setUserLastLoginOn(String userLastLoginOn) {
        this.userLastLoginOn = userLastLoginOn;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
}
