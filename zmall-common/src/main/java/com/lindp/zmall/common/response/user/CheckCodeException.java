package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 校验码输入错误
*
* @author lindp
* @date 2020/9/24
*/
public class CheckCodeException extends CommonException {

    public CheckCodeException() {
        this(null, RestCodeEnum.CheckCodeException.getMessage());
    }

    public CheckCodeException(String message) {
        this(null, message);
    }

    public CheckCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public CheckCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.CheckCodeException, StrUtil.format(message, params), data);
    }
}