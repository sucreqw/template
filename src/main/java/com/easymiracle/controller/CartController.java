package com.easymiracle.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.easymiracle.dto.CartDTO;
import com.easymiracle.dto.CommonResult;
import com.easymiracle.info.CartInfo;
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
        if (null != cartDTO) {
            if (cartDTO.getQuantity() > 0) {
                Integer id = iCartService.addCart(cartDTO);
                result.setData(id);
            } else {
                result.setCode(500);
                result.setMessage("数量少于1！");
            }
        } else {
            result.setCode(500);
            result.setMessage("对象不能为空！");
        }
        return result;
    }

    @GetMapping("/page/{page}/{pageSize}")
    public CommonResult<Page<CartInfo>> cartList(@PathVariable Integer page, @PathVariable Integer pageSize) {
        CommonResult<Page<CartInfo>> result = new CommonResult<>();
        Page<CartInfo> list = iCartService.cartList(page, pageSize);
        result.setData(list);
        return result;
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id) {
        iCartService.deleteItem(id);
    }

    @PutMapping("/")
    public void updateItem(@RequestBody CartDTO cartDTO) {
        iCartService.updataItem(cartDTO);
    }
}
