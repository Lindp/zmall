package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户访问被拦截
*
* @author lindp
* @date 2020/9/24
*/
public class AccessRefuseException extends CommonException {

    public AccessRefuseException() {
        this(null, RestCodeEnum.AccessRefuseException.getMessage());
    }

    public AccessRefuseException(String message) {
        this(null, message);
    }

    public AccessRefuseException(String message, Object... params) {
        this(null, message, params);
    }

    public AccessRefuseException(String data, String message, Object... params) {
        super(RestCodeEnum.AccessRefuseException, StrUtil.format(message, params), data);
    }
}