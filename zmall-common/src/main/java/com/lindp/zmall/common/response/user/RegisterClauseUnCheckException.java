package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户未同意隐私协议
*
* @author lindp
* @date 2020/9/24
*/
public class RegisterClauseUnCheckException extends CommonException {

    public RegisterClauseUnCheckException() {
        this(null, RestCodeEnum.RegisterClauseUnCheckException.getMessage());
    }

    public RegisterClauseUnCheckException(String message) {
        this(null, message);
    }

    public RegisterClauseUnCheckException(String message, Object... params) {
        this(null, message, params);
    }

    public RegisterClauseUnCheckException(String data, String message, Object... params) {
        super(RestCodeEnum.RegisterClauseUnCheckException, StrUtil.format(message, params), data);
    }
}