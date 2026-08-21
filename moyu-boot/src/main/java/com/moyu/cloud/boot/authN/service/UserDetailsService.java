package com.moyu.cloud.boot.authN.service;

import com.moyu.cloud.boot.system.model.entity.SysUser;
import com.moyu.cloud.common.authZ.model.LoginUser;

/**
 * 用户信息服务类
 *
 * @author shisong
 * @since 2026-03-09
 */
public interface UserDetailsService {

    /**
     * 通过username加载登录用户信息
     */
    SysUser loadUserByUsername(String username);

    /**
     * 根据用户实体构造登录用户信息
     */
    LoginUser buildUserDetails(SysUser sysUser);
}
