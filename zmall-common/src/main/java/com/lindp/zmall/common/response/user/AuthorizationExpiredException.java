package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 授权已过期
*
* @author lindp
* @date 2020/9/24
*/
public class AuthorizationExpiredException extends CommonException {

    public AuthorizationExpiredException() {
        this(null, RestCodeEnum.AuthorizationExpiredException.getMessage());
    }

    public AuthorizationExpiredException(String message) {
        this(null, message);
    }

    public AuthorizationExpiredException(String message, Object... params) {
        this(null, message, params);
    }

    public AuthorizationExpiredException(String data, String message, Object... params) {
        super(RestCodeEnum.AuthorizationExpiredException, StrUtil.format(message, params), data);
    }
}