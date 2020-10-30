package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* RPC 执行超时
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdRPCExecuteTimeoutException extends CommonException {

    public ThirdRPCExecuteTimeoutException() {
        this(null, RestCodeEnum.ThirdRPCExecuteTimeoutException.getMessage());
    }

    public ThirdRPCExecuteTimeoutException(String message) {
        this(null, message);
    }

    public ThirdRPCExecuteTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdRPCExecuteTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdRPCExecuteTimeoutException, StrUtil.format(message, params), data);
    }
}