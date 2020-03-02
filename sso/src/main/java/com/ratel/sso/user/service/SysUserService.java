package com.ratel.sso.user.service;

import com.ratel.sso.user.entity.po.SysUser;

/**
 * @author ratel
 * @date 2020/3/2
 */
public interface SysUserService {

    SysUser getUserByUserName(String userName);
}
