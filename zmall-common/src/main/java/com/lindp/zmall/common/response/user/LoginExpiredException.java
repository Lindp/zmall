package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户登陆已过期
*
* @author lindp
* @date 2020/9/24
*/
public class LoginExpiredException extends CommonException {

    public LoginExpiredException() {
        this(null, RestCodeEnum.LoginExpiredException.getMessage());
    }

    public LoginExpiredException(String message) {
        this(null, message);
    }

    public LoginExpiredException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginExpiredException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginExpiredException, StrUtil.format(message, params), data);
    }
}