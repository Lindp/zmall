package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户支付超时
*
* @author lindp
* @date 2020/9/24
*/
public class PayTimeoutException extends CommonException {

    public PayTimeoutException() {
        this(null, RestCodeEnum.PayTimeoutException.getMessage());
    }

    public PayTimeoutException(String message) {
        this(null, message);
    }

    public PayTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public PayTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.PayTimeoutException, StrUtil.format(message, params), data);
    }
}