package com.ratel.sso.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ratel.sso.user.entity.po.SysUser;
import com.ratel.sso.user.mapper.SysUserMapper;
import com.ratel.sso.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ratel
 * @date 2020/3/2
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper userMapper;


    @Override
    public SysUser getUserByUserName(String userName) {
        return userMapper.selectOne(new QueryWrapper<SysUser>().eq("name",userName));
    }
}
