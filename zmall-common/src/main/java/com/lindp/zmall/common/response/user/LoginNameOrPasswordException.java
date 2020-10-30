package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户名或密码错误
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameOrPasswordException extends CommonException {

    public LoginNameOrPasswordException() {
        this(null, RestCodeEnum.LoginNameOrPasswordException.getMessage());
    }

    public LoginNameOrPasswordException(String message) {
        this(null, message);
    }

    public LoginNameOrPasswordException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameOrPasswordException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameOrPasswordException, StrUtil.format(message, params), data);
    }
}