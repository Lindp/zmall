package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 系统订单处理超时
*
* @author lindp
* @date 2020/9/24
*/
public class SystemOrderHandleTimeoutException extends CommonException {

    public SystemOrderHandleTimeoutException() {
        this(null, RestCodeEnum.SystemOrderHandleTimeoutException.getMessage());
    }

    public SystemOrderHandleTimeoutException(String message) {
        this(null, message);
    }

    public SystemOrderHandleTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemOrderHandleTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemOrderHandleTimeoutException, StrUtil.format(message, params), data);
    }
}