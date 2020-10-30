package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 密码长度不够
*
* @author lindp
* @date 2020/9/24
*/
public class PasswordLengthException extends CommonException {

    public PasswordLengthException() {
        this(null, RestCodeEnum.PasswordLengthException.getMessage());
    }

    public PasswordLengthException(String message) {
        this(null, message);
    }

    public PasswordLengthException(String message, Object... params) {
        this(null, message, params);
    }

    public PasswordLengthException(String data, String message, Object... params) {
        super(RestCodeEnum.PasswordLengthException, StrUtil.format(message, params), data);
    }
}