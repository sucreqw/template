package com.easymiracle.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.easymiracle.dto.CartDTO;
import com.easymiracle.repository.entity.CartDO;

/**
 * <p>
 *  服务类接口
 * </p>
 *
 * @author sucre
 * @since 2019-05-10
 */
public interface ICartService extends IService<CartDO> {
    Integer addcart(CartDTO cartDTO);
}
