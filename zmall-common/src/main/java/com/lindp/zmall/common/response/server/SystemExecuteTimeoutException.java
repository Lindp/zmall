package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 系统执行超时
*
* @author lindp
* @date 2020/9/24
*/
public class SystemExecuteTimeoutException extends CommonException {

    public SystemExecuteTimeoutException() {
        this(null, RestCodeEnum.SystemExecuteTimeoutException.getMessage());
    }

    public SystemExecuteTimeoutException(String message) {
        this(null, message);
    }

    public SystemExecuteTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemExecuteTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemExecuteTimeoutException, StrUtil.format(message, params), data);
    }
}