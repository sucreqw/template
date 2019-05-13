package com.easymiracle.repository.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easymiracle.repository.entity.CartDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

/**
 * @author sucre chen 906509023@qq.com
 * @Title: CartDO
 * @Package repository.dao
 * @Description: 购物车pojo类
 * @date 2019-05-10 16:46
 */

public interface CartMapper extends BaseMapper<CartDO> {
    @Select("isExists")
    public CartDO isExists(@Param("userid") Integer userid, @Param("goodsid") Integer goodsid);
}
