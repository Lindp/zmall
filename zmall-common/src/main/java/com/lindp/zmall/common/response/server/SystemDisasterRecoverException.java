package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 系统容灾功能被触发
*
* @author lindp
* @date 2020/9/24
*/
public class SystemDisasterRecoverException extends CommonException {

    public SystemDisasterRecoverException() {
        this(null, RestCodeEnum.SystemDisasterRecoverException.getMessage());
    }

    public SystemDisasterRecoverException(String message) {
        this(null, message);
    }

    public SystemDisasterRecoverException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemDisasterRecoverException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemDisasterRecoverException, StrUtil.format(message, params), data);
    }
}