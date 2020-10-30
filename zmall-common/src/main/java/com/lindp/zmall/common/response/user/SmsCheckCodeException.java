package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 短信校验码输入错误
*
* @author lindp
* @date 2020/9/24
*/
public class SmsCheckCodeException extends CommonException {

    public SmsCheckCodeException() {
        this(null, RestCodeEnum.SmsCheckCodeException.getMessage());
    }

    public SmsCheckCodeException(String message) {
        this(null, message);
    }

    public SmsCheckCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public SmsCheckCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.SmsCheckCodeException, StrUtil.format(message, params), data);
    }
}