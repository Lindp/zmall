package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 访问权限异常
*
* @author lindp
* @date 2020/9/24
*/
public class AuthorizationException extends CommonException {

    public AuthorizationException() {
        this(null, RestCodeEnum.AuthorizationException.getMessage());
    }

    public AuthorizationException(String message) {
        this(null, message);
    }

    public AuthorizationException(String message, Object... params) {
        this(null, message, params);
    }

    public AuthorizationException(String data, String message, Object... params) {
        super(RestCodeEnum.AuthorizationException, StrUtil.format(message, params), data);
    }
}