package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 系统资源耗尽
*
* @author lindp
* @date 2020/9/24
*/
public class SystemNotResourceException extends CommonException {

    public SystemNotResourceException() {
        this(null, RestCodeEnum.SystemNotResourceException.getMessage());
    }

    public SystemNotResourceException(String message) {
        this(null, message);
    }

    public SystemNotResourceException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemNotResourceException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemNotResourceException, StrUtil.format(message, params), data);
    }
}