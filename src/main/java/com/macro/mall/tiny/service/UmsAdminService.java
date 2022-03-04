package com.macro.mall.tiny.service;

import com.macro.mall.tiny.model.UmsAdmin;
import com.macro.mall.tiny.model.UmsPermission;

import java.util.List;

/**
 * @Description: 后台管理员Service
 * @Author: Bentao She
 * @Date: 2022/3/4 15:19
 * @Version: V1.0
 **/

public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
