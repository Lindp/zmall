package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户名包含特殊字符
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameSpecialCharacterException extends CommonException {

    public LoginNameSpecialCharacterException() {
        this(null, RestCodeEnum.LoginNameSpecialCharacterException.getMessage());
    }

    public LoginNameSpecialCharacterException(String message) {
        this(null, message);
    }

    public LoginNameSpecialCharacterException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameSpecialCharacterException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameSpecialCharacterException, StrUtil.format(message, params), data);
    }
}