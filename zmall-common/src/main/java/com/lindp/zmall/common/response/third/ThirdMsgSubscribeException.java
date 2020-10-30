package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 消息订阅出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdMsgSubscribeException extends CommonException {

    public ThirdMsgSubscribeException() {
        this(null, RestCodeEnum.ThirdMsgSubscribeException.getMessage());
    }

    public ThirdMsgSubscribeException(String message) {
        this(null, message);
    }

    public ThirdMsgSubscribeException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdMsgSubscribeException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdMsgSubscribeException, StrUtil.format(message, params), data);
    }
}