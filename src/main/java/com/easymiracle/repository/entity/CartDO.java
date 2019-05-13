package com.easymiracle.repository.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * @author sucre chen 906509023@qq.com
 * @Title: CartDO
 * @Package entity
 * @Description: 购物车pojo类
 * @date 2019-05-10 15:58
 */
@TableName("cart")
public class CartDO implements Serializable {

    private static final long serialVersionUID = -2529483023613775588L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userid;

    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsid;

    /**
     * 数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 创建时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    @TableField(value = "update_date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDate;

    /**
     * 创建人
     */
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    private Integer createUser;

    /**
     * 修改人
     */
    @TableField(value = "update_user", fill = FieldFill.INSERT_UPDATE)
    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        return "CartDO{" +
                "id=" + id +
                ", userid=" + userid +
                ", goodsid=" + goodsid +
                ", quantity=" + quantity +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", createUser=" + createUser +
                ", updateUser=" + updateUser +
                '}';
    }
}
