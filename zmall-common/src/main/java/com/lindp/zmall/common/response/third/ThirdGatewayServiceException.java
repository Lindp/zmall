package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 网关服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdGatewayServiceException extends CommonException {

    public ThirdGatewayServiceException() {
        this(null, RestCodeEnum.ThirdGatewayServiceException.getMessage());
    }

    public ThirdGatewayServiceException(String message) {
        this(null, message);
    }

    public ThirdGatewayServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdGatewayServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdGatewayServiceException, StrUtil.format(message, params), data);
    }
}