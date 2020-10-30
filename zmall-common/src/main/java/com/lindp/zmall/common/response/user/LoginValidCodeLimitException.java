package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户验证码尝试次数超限
*
* @author lindp
* @date 2020/9/24
*/
public class LoginValidCodeLimitException extends CommonException {

    public LoginValidCodeLimitException() {
        this(null, RestCodeEnum.LoginValidCodeLimitException.getMessage());
    }

    public LoginValidCodeLimitException(String message) {
        this(null, message);
    }

    public LoginValidCodeLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginValidCodeLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginValidCodeLimitException, StrUtil.format(message, params), data);
    }
}