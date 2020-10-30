package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户请求参数错误
*
* @author lindp
* @date 2020/9/24
*/
public class ParameterException extends CommonException {

    public ParameterException() {
        this(null, RestCodeEnum.ParameterException.getMessage());
    }

    public ParameterException(String message) {
        this(null, message);
    }

    public ParameterException(String message, Object... params) {
        this(null, message, params);
    }

    public ParameterException(String data, String message, Object... params) {
        super(RestCodeEnum.ParameterException, StrUtil.format(message, params), data);
    }
}