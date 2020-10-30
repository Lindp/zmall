package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户账户被冻结
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameFreezeException extends CommonException {

    public LoginNameFreezeException() {
        this(null, RestCodeEnum.LoginNameFreezeException.getMessage());
    }

    public LoginNameFreezeException(String message) {
        this(null, message);
    }

    public LoginNameFreezeException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameFreezeException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameFreezeException, StrUtil.format(message, params), data);
    }
}