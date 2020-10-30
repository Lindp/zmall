package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 护照编号校验非法
*
* @author lindp
* @date 2020/9/24
*/
public class PassportCodeException extends CommonException {

    public PassportCodeException() {
        this(null, RestCodeEnum.PassportCodeException.getMessage());
    }

    public PassportCodeException(String message) {
        this(null, message);
    }

    public PassportCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public PassportCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.PassportCodeException, StrUtil.format(message, params), data);
    }
}