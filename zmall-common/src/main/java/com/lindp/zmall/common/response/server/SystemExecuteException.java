package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 系统执行出错
*
* @author lindp
* @date 2020/9/24
*/
public class SystemExecuteException extends CommonException {

    public SystemExecuteException() {
        this(null, RestCodeEnum.SystemExecuteException.getMessage());
    }

    public SystemExecuteException(String message) {
        this(null, message);
    }

    public SystemExecuteException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemExecuteException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemExecuteException, StrUtil.format(message, params), data);
    }
}