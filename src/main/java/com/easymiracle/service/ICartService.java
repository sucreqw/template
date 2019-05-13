package com.easymiracle.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.easymiracle.dto.CartDTO;
import com.easymiracle.info.CartInfo;
import com.easymiracle.repository.entity.CartDO;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * <p>
 *  服务类接口
 * </p>
 *
 * @author sucre
 * @since 2019-05-10
 */
public interface ICartService extends IService<CartDO> {
    Integer addCart(CartDTO cartDTO);
    void deleteItem(Integer id);
    void updataItem(CartDTO cartDTO);
    Page<CartInfo> cartList(Integer page,Integer pageSize);
}
