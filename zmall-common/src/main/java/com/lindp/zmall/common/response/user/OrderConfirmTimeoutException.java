package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 确认订单超时
*
* @author lindp
* @date 2020/9/24
*/
public class OrderConfirmTimeoutException extends CommonException {

    public OrderConfirmTimeoutException() {
        this(null, RestCodeEnum.OrderConfirmTimeoutException.getMessage());
    }

    public OrderConfirmTimeoutException(String message) {
        this(null, message);
    }

    public OrderConfirmTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public OrderConfirmTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.OrderConfirmTimeoutException, StrUtil.format(message, params), data);
    }
}