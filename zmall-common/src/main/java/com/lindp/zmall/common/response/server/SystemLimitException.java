package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 系统限流
*
* @author lindp
* @date 2020/9/24
*/
public class SystemLimitException extends CommonException {

    public SystemLimitException() {
        this(null, RestCodeEnum.SystemLimitException.getMessage());
    }

    public SystemLimitException(String message) {
        this(null, message);
    }

    public SystemLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemLimitException, StrUtil.format(message, params), data);
    }
}