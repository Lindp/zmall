package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 手机格式校验失败
*
* @author lindp
* @date 2020/9/24
*/
public class PhoneFormatException extends CommonException {

    public PhoneFormatException() {
        this(null, RestCodeEnum.PhoneFormatException.getMessage());
    }

    public PhoneFormatException(String message) {
        this(null, message);
    }

    public PhoneFormatException(String message, Object... params) {
        this(null, message, params);
    }

    public PhoneFormatException(String data, String message, Object... params) {
        super(RestCodeEnum.PhoneFormatException, StrUtil.format(message, params), data);
    }
}