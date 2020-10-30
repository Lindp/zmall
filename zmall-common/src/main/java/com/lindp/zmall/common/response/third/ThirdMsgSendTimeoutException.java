package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 消息投递超时
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdMsgSendTimeoutException extends CommonException {

    public ThirdMsgSendTimeoutException() {
        this(null, RestCodeEnum.ThirdMsgSendTimeoutException.getMessage());
    }

    public ThirdMsgSendTimeoutException(String message) {
        this(null, message);
    }

    public ThirdMsgSendTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdMsgSendTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdMsgSendTimeoutException, StrUtil.format(message, params), data);
    }
}