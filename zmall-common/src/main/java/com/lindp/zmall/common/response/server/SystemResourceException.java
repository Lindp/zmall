package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 系统资源异常
*
* @author lindp
* @date 2020/9/24
*/
public class SystemResourceException extends CommonException {

    public SystemResourceException() {
        this(null, RestCodeEnum.SystemResourceException.getMessage());
    }

    public SystemResourceException(String message) {
        this(null, message);
    }

    public SystemResourceException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemResourceException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemResourceException, StrUtil.format(message, params), data);
    }
}