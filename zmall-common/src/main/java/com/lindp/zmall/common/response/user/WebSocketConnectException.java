package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* WebSocket 连接异常
*
* @author lindp
* @date 2020/9/24
*/
public class WebSocketConnectException extends CommonException {

    public WebSocketConnectException() {
        this(null, RestCodeEnum.WebSocketConnectException.getMessage());
    }

    public WebSocketConnectException(String message) {
        this(null, message);
    }

    public WebSocketConnectException(String message, Object... params) {
        this(null, message, params);
    }

    public WebSocketConnectException(String data, String message, Object... params) {
        super(RestCodeEnum.WebSocketConnectException, StrUtil.format(message, params), data);
    }
}