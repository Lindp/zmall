package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户设备异常
*
* @author lindp
* @date 2020/9/24
*/
public class DeviceException extends CommonException {

    public DeviceException() {
        this(null, RestCodeEnum.DeviceException.getMessage());
    }

    public DeviceException(String message) {
        this(null, message);
    }

    public DeviceException(String message, Object... params) {
        this(null, message, params);
    }

    public DeviceException(String data, String message, Object... params) {
        super(RestCodeEnum.DeviceException, StrUtil.format(message, params), data);
    }
}