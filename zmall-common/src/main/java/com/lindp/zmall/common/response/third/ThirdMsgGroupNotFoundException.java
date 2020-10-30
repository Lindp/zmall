package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 消息分组未查到
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdMsgGroupNotFoundException extends CommonException {

    public ThirdMsgGroupNotFoundException() {
        this(null, RestCodeEnum.ThirdMsgGroupNotFoundException.getMessage());
    }

    public ThirdMsgGroupNotFoundException(String message) {
        this(null, message);
    }

    public ThirdMsgGroupNotFoundException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdMsgGroupNotFoundException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdMsgGroupNotFoundException, StrUtil.format(message, params), data);
    }
}