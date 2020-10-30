package com.lindp.zmall.common.response;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;

/**
 * Restful 接口异常
 *
 * @author lindp
 * @date 2020/9/24
 */
@Getter
public class CommonException extends RuntimeException {
    private final String code;
    private final String message;
    private final String data;

    public CommonException(String code, String message, String data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonException(RestCodeEnum code) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = null;
    }

    public CommonException(RestCodeEnum code, String data) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }

    public CommonException(RestCodeEnum code, String message, String data) {
        this.code = code.getCode();
        this.message = message;
        this.data = data;
    }

    public Integer getHttpStatusCode() {
        if (StrUtil.isBlank(code)) {
            return -1;
        }
        if (code.startsWith("A")) {
            return 400;
        }
        return 500;
    }
}
