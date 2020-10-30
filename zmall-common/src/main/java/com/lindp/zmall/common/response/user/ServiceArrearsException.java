package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 服务已欠费
*
* @author lindp
* @date 2020/9/24
*/
public class ServiceArrearsException extends CommonException {

    public ServiceArrearsException() {
        this(null, RestCodeEnum.ServiceArrearsException.getMessage());
    }

    public ServiceArrearsException(String message) {
        this(null, message);
    }

    public ServiceArrearsException(String message, Object... params) {
        this(null, message, params);
    }

    public ServiceArrearsException(String data, String message, Object... params) {
        super(RestCodeEnum.ServiceArrearsException, StrUtil.format(message, params), data);
    }
}