package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* WebSocket 连接断开
*
* @author lindp
* @date 2020/9/24
*/
public class WebSocketConnectBreakException extends CommonException {

    public WebSocketConnectBreakException() {
        this(null, RestCodeEnum.WebSocketConnectBreakException.getMessage());
    }

    public WebSocketConnectBreakException(String message) {
        this(null, message);
    }

    public WebSocketConnectBreakException(String message, Object... params) {
        this(null, message, params);
    }

    public WebSocketConnectBreakException(String data, String message, Object... params) {
        super(RestCodeEnum.WebSocketConnectBreakException, StrUtil.format(message, params), data);
    }
}