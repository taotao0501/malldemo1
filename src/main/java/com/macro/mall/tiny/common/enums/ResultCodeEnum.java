package com.macro.mall.tiny.common.enums;

import com.macro.mall.tiny.common.IErrorCode;

/**
 * @Description: API返回结果状态码
 * @Author: Bentao She
 * @Date: 2022/3/2 16:27
 * @Version: V1.0
 **/

public enum ResultCodeEnum implements IErrorCode {

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    private long code;

    private String message;

    ResultCodeEnum(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
