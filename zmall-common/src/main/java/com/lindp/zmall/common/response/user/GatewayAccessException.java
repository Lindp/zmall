package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 网关访问受限
*
* @author lindp
* @date 2020/9/24
*/
public class GatewayAccessException extends CommonException {

    public GatewayAccessException() {
        this(null, RestCodeEnum.GatewayAccessException.getMessage());
    }

    public GatewayAccessException(String message) {
        this(null, message);
    }

    public GatewayAccessException(String message, Object... params) {
        this(null, message, params);
    }

    public GatewayAccessException(String data, String message, Object... params) {
        super(RestCodeEnum.GatewayAccessException, StrUtil.format(message, params), data);
    }
}