package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 中间件服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdMiddlewareServiceException extends CommonException {

    public ThirdMiddlewareServiceException() {
        this(null, RestCodeEnum.ThirdMiddlewareServiceException.getMessage());
    }

    public ThirdMiddlewareServiceException(String message) {
        this(null, message);
    }

    public ThirdMiddlewareServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdMiddlewareServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdMiddlewareServiceException, StrUtil.format(message, params), data);
    }
}