package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户订单号为空
*
* @author lindp
* @date 2020/9/24
*/
public class OrderNoNullException extends CommonException {

    public OrderNoNullException() {
        this(null, RestCodeEnum.OrderNoNullException.getMessage());
    }

    public OrderNoNullException(String message) {
        this(null, message);
    }

    public OrderNoNullException(String message, Object... params) {
        this(null, message, params);
    }

    public OrderNoNullException(String data, String message, Object... params) {
        super(RestCodeEnum.OrderNoNullException, StrUtil.format(message, params), data);
    }
}