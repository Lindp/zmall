package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户名包含敏感词
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameSensitiveWordsException extends CommonException {

    public LoginNameSensitiveWordsException() {
        this(null, RestCodeEnum.LoginNameSensitiveWordsException.getMessage());
    }

    public LoginNameSensitiveWordsException(String message) {
        this(null, message);
    }

    public LoginNameSensitiveWordsException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameSensitiveWordsException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameSensitiveWordsException, StrUtil.format(message, params), data);
    }
}