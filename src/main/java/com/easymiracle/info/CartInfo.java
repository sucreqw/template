package com.easymiracle.info;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author sucre chen 906509023@qq.com
 * @Title: CartDO
 * @Package entity
 * @Description: 购物车pojo类
 * @date 2019-05-10 15:58
 */
@TableName("cart")
public class CartInfo {

    private Integer id;

    private Integer userid;

    private Integer goodsid;

    private Integer quantity;


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
    @Override
    public String toString() {
        return "CartDO{" +
                "id=" + id +
                ", userid=" + userid +
                ", goodsid=" + goodsid +
                ", quantity=" + quantity +
                '}';
    }
}
