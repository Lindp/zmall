package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* value 长度超过限制
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdValueLengthException extends CommonException {

    public ThirdValueLengthException() {
        this(null, RestCodeEnum.ThirdValueLengthException.getMessage());
    }

    public ThirdValueLengthException(String message) {
        this(null, message);
    }

    public ThirdValueLengthException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdValueLengthException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdValueLengthException, StrUtil.format(message, params), data);
    }
}