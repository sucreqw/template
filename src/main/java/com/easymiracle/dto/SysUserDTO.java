package com.easymiracle.dto;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2019-05-08
 */
public class SysUserDTO   {

    private String account;

    private String name;

    private String email;

    private String mobile;

    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUserDO{" +
        ", account=" + account +
        ", name=" + name +
        ", email=" + email +
        ", mobile=" + mobile +
        ", password=" + password +
        "}";
    }
}
