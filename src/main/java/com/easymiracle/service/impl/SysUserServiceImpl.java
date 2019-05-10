package com.easymiracle.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easymiracle.dto.SysUserDTO;
import com.easymiracle.info.SysUserInfo;
import com.easymiracle.repository.dao.SysUserMapper;
import com.easymiracle.repository.entity.SysUserDO;
import com.easymiracle.service.ISysUserService;
import com.easymiracle.util.PageUtil;
import com.easymiracle.util.PasswordEncoderUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-08
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUserDO> implements ISysUserService {


    @Override
    public Integer createUser(SysUserDTO sysUserDTO) {
        SysUserDO sysUserDO = new SysUserDO();
        BeanUtils.copyProperties(sysUserDTO, sysUserDO);
        sysUserDO.setPassword(PasswordEncoderUtil.encoder(sysUserDTO.getPassword()));
        baseMapper.insert(sysUserDO);
        return sysUserDO.getId();
    }

    @Override
    public void updateUser(Integer id, SysUserDTO sysUserDTO) {
        SysUserDO sysUserDO = baseMapper.selectById(id);
        if (sysUserDO == null) {
            return;
        }
        BeanUtils.copyProperties(sysUserDTO, sysUserDO);
        baseMapper.updateById(sysUserDO);
    }

    @Override
    public void deleteUser(Integer id) {
        baseMapper.deleteById(id);
    }

    @Override
    public SysUserInfo getUser(Integer id) {
        SysUserDO sysUserDO = baseMapper.selectById(id);
        if (sysUserDO == null) {
            return null;
        }
        SysUserInfo sysUserInfo = new SysUserInfo();
        BeanUtils.copyProperties(sysUserDO, sysUserInfo);
        return sysUserInfo;
    }

    @Override
    public Page<SysUserInfo> listPage(Integer page, Integer pageSize) {
        QueryWrapper<SysUserDO> wrapper = new QueryWrapper<>();
        Page<SysUserDO> userDOPage = new Page<>(page, pageSize);
        return PageUtil.buildPage(baseMapper.selectPage(userDOPage, wrapper), SysUserInfo.class);
    }

    @Override
    public SysUserInfo getSysUserByAccount(String account) {
        QueryWrapper<SysUserDO> wrapper = new QueryWrapper<>();
        wrapper.eq("account", account);
        SysUserInfo sysUserInfo = new SysUserInfo();
        SysUserDO sysUserDO = baseMapper.selectOne(wrapper);
        BeanUtils.copyProperties(sysUserDO, sysUserInfo);
        return sysUserInfo;
    }
}
