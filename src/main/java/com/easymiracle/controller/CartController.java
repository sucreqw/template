package com.easymiracle.controller;

import com.easymiracle.dto.CartDTO;
import com.easymiracle.dto.CommonResult;
import com.easymiracle.enums.ResultCodeEnum;
import com.easymiracle.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public CommonResult<Integer> addcart(@RequestBody CartDTO cartDTO) {
        CommonResult<Integer> result = new CommonResult<>();
        if (null!=cartDTO) {
            if(cartDTO.getQuantity()>0) {
                Integer id = iCartService.addCart(cartDTO);
                result.setData(id);
            }else{
                result.setCode(500);
                result.setMessage("数量少于1！");
            }
        }else{
            result.setCode(500);
            result.setMessage("对象不能为空！");
        }
        return result;
    }
}
