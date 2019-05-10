package com.easymiracle.controller;


import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.easymiracle.dto.CommonResult;
import com.easymiracle.dto.SysUserDTO;
import com.easymiracle.enums.ResultCodeEnum;
import com.easymiracle.exception.BizException;
import com.easymiracle.info.SysUserInfo;
import com.easymiracle.service.ISysUserService;
import com.easymiracle.util.PasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-05-08
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService iSysUserService;

    @PostMapping("/")
    public CommonResult<Integer> createUser(@RequestBody SysUserDTO sysUserDTO) {
        CommonResult<Integer> result = new CommonResult<>();
        Integer id = iSysUserService.createUser(sysUserDTO);
        result.setData(id);
        return result;
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody SysUserDTO sysUserDTO) {
        iSysUserService.updateUser(id, sysUserDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        iSysUserService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public CommonResult<SysUserInfo> getUser(@PathVariable Integer id) {
        CommonResult<SysUserInfo> result = new CommonResult<>();
        SysUserInfo sysUserInfo = iSysUserService.getUser(id);
        result.setData(sysUserInfo);
        return result;
    }

    @GetMapping("/page/{page}/{pageSize}")
    public CommonResult<Page<SysUserInfo>> listPage(@PathVariable Integer page, @PathVariable Integer pageSize) {
        CommonResult<Page<SysUserInfo>> result = new CommonResult<>();
        Page<SysUserInfo> list = iSysUserService.listPage(page, pageSize);
        result.setData(list);
        return result;
    }

    @PutMapping("/login")
    public CommonResult<String> login(@RequestBody SysUserDTO sysUserDTO) {
        CommonResult<String> result = new CommonResult<>();
        SysUserInfo sysUserInfo = iSysUserService.getSysUserByAccount(sysUserDTO.getAccount());
        if (!PasswordEncoderUtil.eq(sysUserDTO.getPassword(), sysUserInfo.getPassword())) {
            throw new BizException(ResultCodeEnum.ACCOUNT_ERROR);
        }
        String token = JWT.create().withClaim("sysUser", JSON.toJSONString(sysUserInfo)).sign(Algorithm.HMAC256(PasswordEncoderUtil.KEY));
        result.setData(token);
        return result;
    }
}

