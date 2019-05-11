package com.easymiracle.controller;

import com.easymiracle.dto.CartDTO;
import com.easymiracle.dto.CommonResult;
import com.easymiracle.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器 购物车
 * </p>
 *
 * @author sucre
 * @since 2019-05-10
 */
@RestController
@RequestMapping("/cartDO")
public class CartController {

    @Autowired
    private ICartService iCartService;

    @PostMapping("/addcart")
    public CommonResult<Integer> addcart(CartDTO cartDTO) {
        CommonResult<Integer> result = new CommonResult<>();
        Integer id = iCartService.addcart(cartDTO);
        result.setData(id);
        return result;
    }
}
