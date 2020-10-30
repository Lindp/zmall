package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* RSA 签名错误
*
* @author lindp
* @date 2020/9/24
*/
public class RSASignException extends CommonException {

    public RSASignException() {
        this(null, RestCodeEnum.RSASignException.getMessage());
    }

    public RSASignException(String message) {
        this(null, message);
    }

    public RSASignException(String message, Object... params) {
        this(null, message, params);
    }

    public RSASignException(String data, String message, Object... params) {
        super(RestCodeEnum.RSASignException, StrUtil.format(message, params), data);
    }
}