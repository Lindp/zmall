package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 网络资源服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdNetworkResourceServiceException extends CommonException {

    public ThirdNetworkResourceServiceException() {
        this(null, RestCodeEnum.ThirdNetworkResourceServiceException.getMessage());
    }

    public ThirdNetworkResourceServiceException(String message) {
        this(null, message);
    }

    public ThirdNetworkResourceServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdNetworkResourceServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdNetworkResourceServiceException, StrUtil.format(message, params), data);
    }
}