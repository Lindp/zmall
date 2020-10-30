package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户重复请求
*
* @author lindp
* @date 2020/9/24
*/
public class RequestRepeatException extends CommonException {

    public RequestRepeatException() {
        this(null, RestCodeEnum.RequestRepeatException.getMessage());
    }

    public RequestRepeatException(String message) {
        this(null, message);
    }

    public RequestRepeatException(String message, Object... params) {
        this(null, message, params);
    }

    public RequestRepeatException(String data, String message, Object... params) {
        super(RestCodeEnum.RequestRepeatException, StrUtil.format(message, params), data);
    }
}