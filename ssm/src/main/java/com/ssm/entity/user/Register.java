package com.ssm.entity.user;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/3/8
 * Time: 15:38
 */
/*
注册实体
 */
public class Register implements Serializable {
    private static final long serialVersionUID = 7647725574155261856L;
    //用户名
    @NotNull
    private String name;
    //密码
    @NotNull
    private String pwd;
    //重复密码
    private String repeatPwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRepeatPwd() {
        return repeatPwd;
    }

    public void setRepeatPwd(String repeatPwd) {
        this.repeatPwd = repeatPwd;
    }
}
