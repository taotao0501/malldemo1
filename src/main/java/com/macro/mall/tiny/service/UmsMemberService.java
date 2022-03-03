package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.CommonResult;

/**
 * @Description: 会员管理Service
 * @Author: Bentao She
 * @Date: 2022/3/3 15:44
 * @Version: V1.0
 **/

public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
