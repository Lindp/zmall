package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户注册错误
*
* @author lindp
* @date 2020/9/24
*/
public class RegisterException extends CommonException {

    public RegisterException() {
        this(null, RestCodeEnum.RegisterException.getMessage());
    }

    public RegisterException(String message) {
        this(null, message);
    }

    public RegisterException(String message, Object... params) {
        this(null, message, params);
    }

    public RegisterException(String data, String message, Object... params) {
        super(RestCodeEnum.RegisterException, StrUtil.format(message, params), data);
    }
}