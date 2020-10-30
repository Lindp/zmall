package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* key 长度超过限制
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdKeyLengthException extends CommonException {

    public ThirdKeyLengthException() {
        this(null, RestCodeEnum.ThirdKeyLengthException.getMessage());
    }

    public ThirdKeyLengthException(String message) {
        this(null, message);
    }

    public ThirdKeyLengthException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdKeyLengthException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdKeyLengthException, StrUtil.format(message, params), data);
    }
}