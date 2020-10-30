package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 订购数量为空
*
* @author lindp
* @date 2020/9/24
*/
public class OrderNumNullException extends CommonException {

    public OrderNumNullException() {
        this(null, RestCodeEnum.OrderNumNullException.getMessage());
    }

    public OrderNumNullException(String message) {
        this(null, message);
    }

    public OrderNumNullException(String message, Object... params) {
        this(null, message, params);
    }

    public OrderNumNullException(String data, String message, Object... params) {
        super(RestCodeEnum.OrderNumNullException, StrUtil.format(message, params), data);
    }
}