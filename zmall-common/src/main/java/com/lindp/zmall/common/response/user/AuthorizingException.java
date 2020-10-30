package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 正在授权中
*
* @author lindp
* @date 2020/9/24
*/
public class AuthorizingException extends CommonException {

    public AuthorizingException() {
        this(null, RestCodeEnum.AuthorizingException.getMessage());
    }

    public AuthorizingException(String message) {
        this(null, message);
    }

    public AuthorizingException(String message, Object... params) {
        this(null, message, params);
    }

    public AuthorizingException(String data, String message, Object... params) {
        super(RestCodeEnum.AuthorizingException, StrUtil.format(message, params), data);
    }
}