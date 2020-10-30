package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 邮箱格式校验失败
*
* @author lindp
* @date 2020/9/24
*/
public class EmailFormatException extends CommonException {

    public EmailFormatException() {
        this(null, RestCodeEnum.EmailFormatException.getMessage());
    }

    public EmailFormatException(String message) {
        this(null, message);
    }

    public EmailFormatException(String message, Object... params) {
        this(null, message, params);
    }

    public EmailFormatException(String data, String message, Object... params) {
        super(RestCodeEnum.EmailFormatException, StrUtil.format(message, params), data);
    }
}