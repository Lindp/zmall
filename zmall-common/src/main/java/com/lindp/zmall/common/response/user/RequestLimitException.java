package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 请求次数超出限制
*
* @author lindp
* @date 2020/9/24
*/
public class RequestLimitException extends CommonException {

    public RequestLimitException() {
        this(null, RestCodeEnum.RequestLimitException.getMessage());
    }

    public RequestLimitException(String message) {
        this(null, message);
    }

    public RequestLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public RequestLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.RequestLimitException, StrUtil.format(message, params), data);
    }
}