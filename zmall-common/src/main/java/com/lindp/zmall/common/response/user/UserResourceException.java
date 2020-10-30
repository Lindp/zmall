package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户资源异常
*
* @author lindp
* @date 2020/9/24
*/
public class UserResourceException extends CommonException {

    public UserResourceException() {
        this(null, RestCodeEnum.UserResourceException.getMessage());
    }

    public UserResourceException(String message) {
        this(null, message);
    }

    public UserResourceException(String message, Object... params) {
        this(null, message, params);
    }

    public UserResourceException(String data, String message, Object... params) {
        super(RestCodeEnum.UserResourceException, StrUtil.format(message, params), data);
    }
}