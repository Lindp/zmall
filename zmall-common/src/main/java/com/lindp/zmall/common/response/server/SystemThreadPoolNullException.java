package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 系统线程池耗尽
*
* @author lindp
* @date 2020/9/24
*/
public class SystemThreadPoolNullException extends CommonException {

    public SystemThreadPoolNullException() {
        this(null, RestCodeEnum.SystemThreadPoolNullException.getMessage());
    }

    public SystemThreadPoolNullException(String message) {
        this(null, message);
    }

    public SystemThreadPoolNullException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemThreadPoolNullException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemThreadPoolNullException, StrUtil.format(message, params), data);
    }
}