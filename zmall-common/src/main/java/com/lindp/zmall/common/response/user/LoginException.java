package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户登陆异常
*
* @author lindp
* @date 2020/9/24
*/
public class LoginException extends CommonException {

    public LoginException() {
        this(null, RestCodeEnum.LoginException.getMessage());
    }

    public LoginException(String message) {
        this(null, message);
    }

    public LoginException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginException, StrUtil.format(message, params), data);
    }
}