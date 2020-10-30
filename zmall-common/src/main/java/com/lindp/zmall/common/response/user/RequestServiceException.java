package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户请求服务异常
*
* @author lindp
* @date 2020/9/24
*/
public class RequestServiceException extends CommonException {

    public RequestServiceException() {
        this(null, RestCodeEnum.RequestServiceException.getMessage());
    }

    public RequestServiceException(String message) {
        this(null, message);
    }

    public RequestServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public RequestServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.RequestServiceException, StrUtil.format(message, params), data);
    }
}