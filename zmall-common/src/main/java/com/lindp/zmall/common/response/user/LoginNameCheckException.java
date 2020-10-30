package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户名校验失败
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameCheckException extends CommonException {

    public LoginNameCheckException() {
        this(null, RestCodeEnum.LoginNameCheckException.getMessage());
    }

    public LoginNameCheckException(String message) {
        this(null, message);
    }

    public LoginNameCheckException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameCheckException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameCheckException, StrUtil.format(message, params), data);
    }
}