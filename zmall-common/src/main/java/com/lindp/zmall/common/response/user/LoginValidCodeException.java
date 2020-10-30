package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户验证码错误
*
* @author lindp
* @date 2020/9/24
*/
public class LoginValidCodeException extends CommonException {

    public LoginValidCodeException() {
        this(null, RestCodeEnum.LoginValidCodeException.getMessage());
    }

    public LoginValidCodeException(String message) {
        this(null, message);
    }

    public LoginValidCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginValidCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginValidCodeException, StrUtil.format(message, params), data);
    }
}