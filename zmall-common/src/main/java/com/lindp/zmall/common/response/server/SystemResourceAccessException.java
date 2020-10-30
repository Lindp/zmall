package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 系统资源访问异常
*
* @author lindp
* @date 2020/9/24
*/
public class SystemResourceAccessException extends CommonException {

    public SystemResourceAccessException() {
        this(null, RestCodeEnum.SystemResourceAccessException.getMessage());
    }

    public SystemResourceAccessException(String message) {
        this(null, message);
    }

    public SystemResourceAccessException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemResourceAccessException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemResourceAccessException, StrUtil.format(message, params), data);
    }
}