package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 消息投递出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdMsgSendException extends CommonException {

    public ThirdMsgSendException() {
        this(null, RestCodeEnum.ThirdMsgSendException.getMessage());
    }

    public ThirdMsgSendException(String message) {
        this(null, message);
    }

    public ThirdMsgSendException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdMsgSendException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdMsgSendException, StrUtil.format(message, params), data);
    }
}