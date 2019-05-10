package com.easymiracle.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.easymiracle.dto.SysUserDTO;
import com.easymiracle.info.SysUserInfo;
import com.easymiracle.repository.entity.SysUserDO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-08
 */
public interface ISysUserService extends IService<SysUserDO> {

    Integer createUser(SysUserDTO sysUserDTO);

    void updateUser(Integer id, SysUserDTO sysUserDTO);

    void deleteUser(Integer id);

    SysUserInfo getUser(Integer id);

    Page<SysUserInfo> listPage(Integer page, Integer pageSize);

    SysUserInfo getSysUserByAccount(String account);
}
