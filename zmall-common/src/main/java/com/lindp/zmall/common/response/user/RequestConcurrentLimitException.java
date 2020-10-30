package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 请求并发数超出限制
*
* @author lindp
* @date 2020/9/24
*/
public class RequestConcurrentLimitException extends CommonException {

    public RequestConcurrentLimitException() {
        this(null, RestCodeEnum.RequestConcurrentLimitException.getMessage());
    }

    public RequestConcurrentLimitException(String message) {
        this(null, message);
    }

    public RequestConcurrentLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public RequestConcurrentLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.RequestConcurrentLimitException, StrUtil.format(message, params), data);
    }
}