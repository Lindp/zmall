package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 请求 JSON 解析失败
*
* @author lindp
* @date 2020/9/24
*/
public class RequestJsonParseException extends CommonException {

    public RequestJsonParseException() {
        this(null, RestCodeEnum.RequestJsonParseException.getMessage());
    }

    public RequestJsonParseException(String message) {
        this(null, message);
    }

    public RequestJsonParseException(String message, Object... params) {
        this(null, message, params);
    }

    public RequestJsonParseException(String data, String message, Object... params) {
        super(RestCodeEnum.RequestJsonParseException, StrUtil.format(message, params), data);
    }
}