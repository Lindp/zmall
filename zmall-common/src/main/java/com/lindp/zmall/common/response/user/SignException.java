package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户签名异常
*
* @author lindp
* @date 2020/9/24
*/
public class SignException extends CommonException {

    public SignException() {
        this(null, RestCodeEnum.SignException.getMessage());
    }

    public SignException(String message) {
        this(null, message);
    }

    public SignException(String message, Object... params) {
        this(null, message, params);
    }

    public SignException(String data, String message, Object... params) {
        super(RestCodeEnum.SignException, StrUtil.format(message, params), data);
    }
}