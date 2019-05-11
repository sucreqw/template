package com.easymiracle.dto;

public class CartDTO {
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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "id=" + id +
                ", userid=" + userid +
                ", goodsid=" + goodsid +
                ", quantity=" + quantity +
                '}';
    }
}
