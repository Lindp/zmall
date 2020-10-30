package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 密码强度不够
*
* @author lindp
* @date 2020/9/24
*/
public class PasswordEasyException extends CommonException {

    public PasswordEasyException() {
        this(null, RestCodeEnum.PasswordEasyException.getMessage());
    }

    public PasswordEasyException(String message) {
        this(null, message);
    }

    public PasswordEasyException(String message, Object... params) {
        this(null, message, params);
    }

    public PasswordEasyException(String data, String message, Object... params) {
        super(RestCodeEnum.PasswordEasyException, StrUtil.format(message, params), data);
    }
}