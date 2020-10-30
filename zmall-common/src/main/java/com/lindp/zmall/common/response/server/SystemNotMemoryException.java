package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 系统内存耗尽
*
* @author lindp
* @date 2020/9/24
*/
public class SystemNotMemoryException extends CommonException {

    public SystemNotMemoryException() {
        this(null, RestCodeEnum.SystemNotMemoryException.getMessage());
    }

    public SystemNotMemoryException(String message) {
        this(null, message);
    }

    public SystemNotMemoryException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemNotMemoryException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemNotMemoryException, StrUtil.format(message, params), data);
    }
}