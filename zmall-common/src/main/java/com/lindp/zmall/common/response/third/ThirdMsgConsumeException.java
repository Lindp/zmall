package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 消息消费出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdMsgConsumeException extends CommonException {

    public ThirdMsgConsumeException() {
        this(null, RestCodeEnum.ThirdMsgConsumeException.getMessage());
    }

    public ThirdMsgConsumeException(String message) {
        this(null, message);
    }

    public ThirdMsgConsumeException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdMsgConsumeException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdMsgConsumeException, StrUtil.format(message, params), data);
    }
}