package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 订单已关闭
*
* @author lindp
* @date 2020/9/24
*/
public class OrderClosedException extends CommonException {

    public OrderClosedException() {
        this(null, RestCodeEnum.OrderClosedException.getMessage());
    }

    public OrderClosedException(String message) {
        this(null, message);
    }

    public OrderClosedException(String message, Object... params) {
        this(null, message, params);
    }

    public OrderClosedException(String data, String message, Object... params) {
        super(RestCodeEnum.OrderClosedException, StrUtil.format(message, params), data);
    }
}