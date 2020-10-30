package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 密码校验失败
*
* @author lindp
* @date 2020/9/24
*/
public class PasswordCheckException extends CommonException {

    public PasswordCheckException() {
        this(null, RestCodeEnum.PasswordCheckException.getMessage());
    }

    public PasswordCheckException(String message) {
        this(null, message);
    }

    public PasswordCheckException(String message, Object... params) {
        this(null, message, params);
    }

    public PasswordCheckException(String data, String message, Object... params) {
        super(RestCodeEnum.PasswordCheckException, StrUtil.format(message, params), data);
    }
}