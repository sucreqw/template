package com.easymiracle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easymiracle.repository.dao.CartMapper;
import com.easymiracle.repository.entity.CartDO;
import com.easymiracle.service.ICartService;

/**
 * @author sucre chen 906509023@qq.com
 * @Title: CartServiceImpl
 * @Package service.impl
 * @Description: 购物车增删改查实现类
 * @date 2019-05-10 17:17
 */
public class CartServiceImpl extends ServiceImpl<CartMapper, CartDO> implements ICartService {
}
