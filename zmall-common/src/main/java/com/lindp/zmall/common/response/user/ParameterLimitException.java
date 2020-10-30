package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 请求参数值超出允许的范围
*
* @author lindp
* @date 2020/9/24
*/
public class ParameterLimitException extends CommonException {

    public ParameterLimitException() {
        this(null, RestCodeEnum.ParameterLimitException.getMessage());
    }

    public ParameterLimitException(String message) {
        this(null, message);
    }

    public ParameterLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public ParameterLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.ParameterLimitException, StrUtil.format(message, params), data);
    }
}