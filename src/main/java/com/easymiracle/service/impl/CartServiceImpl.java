package com.easymiracle.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easymiracle.dto.CartDTO;
import com.easymiracle.repository.dao.CartMapper;
import com.easymiracle.repository.entity.CartDO;
import com.easymiracle.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sucre chen 906509023@qq.com
 * @Title: CartServiceImpl
 * @Package service.impl
 * @Description: 购物车增删改查实现类
 * @date 2019-05-10 17:17
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, CartDO> implements ICartService {

    // @Autowired
    //CartMapper cartMapper;

    /**
     * 向购物车增加一个商品。
     *
     * @param cartDTO 前端对应的dto对象。
     * @return 增加成功后对应的id。
     */
    @Override
    public Integer addCart(CartDTO cartDTO) {
        CartDO cartDO ;

        //先查看用户是否已经添加过该商品。 方法1：
        /*QueryWrapper<CartDO> qw = new QueryWrapper<>();
        Map<String, Integer> queryMap = new HashMap<>();
        queryMap.put("user_id", cartDTO.getUserid());
        queryMap.put("goods_id", cartDTO.getGoodsid());
        qw.allEq(queryMap);
        cartDO = baseMapper.selectOne(qw);*/


        //方法2：
        cartDO = baseMapper.isExists(cartDTO.getUserid(), cartDTO.getGoodsid());

        //商品在购物车已经存在。
        if (cartDO != null) {
            cartDTO.setId(cartDO.getId());
            cartDTO.setQuantity(cartDO.getQuantity() + cartDTO.getQuantity());
            updataItem(cartDTO);
        } else {
            cartDO=new CartDO();
            BeanUtils.copyProperties(cartDTO, cartDO);
            /*cartDO.setUserid(cartDTO.getUserid());
            cartDO.setGoodsid(cartDTO.getGoodsid());
            cartDO.setQuantity(cartDTO.getQuantity());*/
            //插入商品到购物车
           baseMapper.insert(cartDO);
        }
        return cartDO.getId();
    }

    @Override
    public void deleteItem(Integer id) {

    }

    @Override
    public Integer updataItem(CartDTO cartDTO) {
        CartDO cartDO = new CartDO();
        BeanUtils.copyProperties(cartDTO, cartDO);
        return baseMapper.updateById(cartDO);
    }

    @Override
    public List<CartDTO> cartList() {
        return null;
    }
}
