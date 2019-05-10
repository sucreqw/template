package com.easymiracle.info;

import com.alibaba.fastjson.annotation.JSONField;

import java.time.LocalDateTime;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author ${author}
 * @since 2019-05-08
 */
public class SysUserInfo {

    private Integer id;

    private String account;

    private String name;

    private String email;

    private String mobile;

    @JSONField(serialize=false)
    private String password;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private Integer createUser;

    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "SysUserDO{" +
                "id=" + id +
                ", account=" + account +
                ", name=" + name +
                ", email=" + email +
                ", mobile=" + mobile +
                ", password=" + password +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", createUser=" + createUser +
                ", updateUser=" + updateUser +
                "}";
    }
}
