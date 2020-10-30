package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户账户已作废
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameCancelException extends CommonException {

    public LoginNameCancelException() {
        this(null, RestCodeEnum.LoginNameCancelException.getMessage());
    }

    public LoginNameCancelException(String message) {
        this(null, message);
    }

    public LoginNameCancelException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameCancelException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameCancelException, StrUtil.format(message, params), data);
    }
}