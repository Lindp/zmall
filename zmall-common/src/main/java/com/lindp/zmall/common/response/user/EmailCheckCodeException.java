package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 邮件校验码输入错误
*
* @author lindp
* @date 2020/9/24
*/
public class EmailCheckCodeException extends CommonException {

    public EmailCheckCodeException() {
        this(null, RestCodeEnum.EmailCheckCodeException.getMessage());
    }

    public EmailCheckCodeException(String message) {
        this(null, message);
    }

    public EmailCheckCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public EmailCheckCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.EmailCheckCodeException, StrUtil.format(message, params), data);
    }
}