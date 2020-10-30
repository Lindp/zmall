package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户账户不存在
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameNotFoundException extends CommonException {

    public LoginNameNotFoundException() {
        this(null, RestCodeEnum.LoginNameNotFoundException.getMessage());
    }

    public LoginNameNotFoundException(String message) {
        this(null, message);
    }

    public LoginNameNotFoundException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameNotFoundException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameNotFoundException, StrUtil.format(message, params), data);
    }
}