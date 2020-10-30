package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 系统连接池耗尽
*
* @author lindp
* @date 2020/9/24
*/
public class SystemConnectionPoolNullException extends CommonException {

    public SystemConnectionPoolNullException() {
        this(null, RestCodeEnum.SystemConnectionPoolNullException.getMessage());
    }

    public SystemConnectionPoolNullException(String message) {
        this(null, message);
    }

    public SystemConnectionPoolNullException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemConnectionPoolNullException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemConnectionPoolNullException, StrUtil.format(message, params), data);
    }
}