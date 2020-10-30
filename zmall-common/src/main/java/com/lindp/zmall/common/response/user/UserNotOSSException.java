package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户 OSS 容量不足
*
* @author lindp
* @date 2020/9/24
*/
public class UserNotOSSException extends CommonException {

    public UserNotOSSException() {
        this(null, RestCodeEnum.UserNotOSSException.getMessage());
    }

    public UserNotOSSException(String message) {
        this(null, message);
    }

    public UserNotOSSException(String message, Object... params) {
        this(null, message, params);
    }

    public UserNotOSSException(String data, String message, Object... params) {
        super(RestCodeEnum.UserNotOSSException, StrUtil.format(message, params), data);
    }
}