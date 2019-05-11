package com.easymiracle.service.impl;

import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easymiracle.dto.CartDTO;
import com.easymiracle.repository.dao.CartMapper;
import com.easymiracle.repository.entity.CartDO;
import com.easymiracle.service.ICartService;
import org.springframework.stereotype.Service;

/**
 * @author sucre chen 906509023@qq.com
 * @Title: CartServiceImpl
 * @Package service.impl
 * @Description: 购物车增删改查实现类
 * @date 2019-05-10 17:17
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, CartDO> implements ICartService {
    /**
     * 向购物车增加一个商品。
     *
     * @param cartDTO 前端对应的dto对象。
     * @return 增加成功后对应的id。
     */
    @Override
    public Integer addcart(CartDTO cartDTO) {
        CartDO cartDO = new CartDO();
        BeanUtils.copyProperties(cartDTO, cartDO);
        baseMapper.insert(cartDO);
        return cartDO.getId();
    }
}
