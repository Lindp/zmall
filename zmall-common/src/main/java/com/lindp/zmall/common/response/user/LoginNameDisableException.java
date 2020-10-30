package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户账户已禁用
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameDisableException extends CommonException {

    public LoginNameDisableException() {
        this(null, RestCodeEnum.LoginNameDisableException.getMessage());
    }

    public LoginNameDisableException(String message) {
        this(null, message);
    }

    public LoginNameDisableException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameDisableException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameDisableException, StrUtil.format(message, params), data);
    }
}