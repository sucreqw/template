package com.easymiracle.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
    public void setcreateUser(Integer u){
        System.out.println(u);
    }
    public void setcreateDate(LocalDateTime d){
        System.out.println(d);
    }
    public void setupdateDate(LocalDateTime d){
        System.out.println(d);
    }
    public void setupdateUser(int d){
        System.out.println(d);
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
