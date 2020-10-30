package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 参数格式不匹配
*
* @author lindp
* @date 2020/9/24
*/
public class ParameterFormatException extends CommonException {

    public ParameterFormatException() {
        this(null, RestCodeEnum.ParameterFormatException.getMessage());
    }

    public ParameterFormatException(String message) {
        this(null, message);
    }

    public ParameterFormatException(String message, Object... params) {
        this(null, message, params);
    }

    public ParameterFormatException(String data, String message, Object... params) {
        super(RestCodeEnum.ParameterFormatException, StrUtil.format(message, params), data);
    }
}