package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户输入密码次数超限
*
* @author lindp
* @date 2020/9/24
*/
public class LoginPasswordInputLimitException extends CommonException {

    public LoginPasswordInputLimitException() {
        this(null, RestCodeEnum.LoginPasswordInputLimitException.getMessage());
    }

    public LoginPasswordInputLimitException(String message) {
        this(null, message);
    }

    public LoginPasswordInputLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginPasswordInputLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginPasswordInputLimitException, StrUtil.format(message, params), data);
    }
}