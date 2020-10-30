package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 消息服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdMsgException extends CommonException {

    public ThirdMsgException() {
        this(null, RestCodeEnum.ThirdMsgException.getMessage());
    }

    public ThirdMsgException(String message) {
        this(null, message);
    }

    public ThirdMsgException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdMsgException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdMsgException, StrUtil.format(message, params), data);
    }
}