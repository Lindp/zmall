package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户 API 请求版本过低
*
* @author lindp
* @date 2020/9/24
*/
public class VersionApiLowException extends CommonException {

    public VersionApiLowException() {
        this(null, RestCodeEnum.VersionApiLowException.getMessage());
    }

    public VersionApiLowException(String message) {
        this(null, message);
    }

    public VersionApiLowException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionApiLowException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionApiLowException, StrUtil.format(message, params), data);
    }
}