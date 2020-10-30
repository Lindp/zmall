package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户密码错误
*
* @author lindp
* @date 2020/9/24
*/
public class LoginPasswordException extends CommonException {

    public LoginPasswordException() {
        this(null, RestCodeEnum.LoginPasswordException.getMessage());
    }

    public LoginPasswordException(String message) {
        this(null, message);
    }

    public LoginPasswordException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginPasswordException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginPasswordException, StrUtil.format(message, params), data);
    }
}