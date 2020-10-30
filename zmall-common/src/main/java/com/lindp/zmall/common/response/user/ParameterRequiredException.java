package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 请求必填参数为空
*
* @author lindp
* @date 2020/9/24
*/
public class ParameterRequiredException extends CommonException {

    public ParameterRequiredException() {
        this(null, RestCodeEnum.ParameterRequiredException.getMessage());
    }

    public ParameterRequiredException(String message) {
        this(null, message);
    }

    public ParameterRequiredException(String message, Object... params) {
        this(null, message, params);
    }

    public ParameterRequiredException(String data, String message, Object... params) {
        super(RestCodeEnum.ParameterRequiredException, StrUtil.format(message, params), data);
    }
}