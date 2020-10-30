package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 无权限使用 API
*
* @author lindp
* @date 2020/9/24
*/
public class NoPermissionAPIException extends CommonException {

    public NoPermissionAPIException() {
        this(null, RestCodeEnum.NoPermissionAPIException.getMessage());
    }

    public NoPermissionAPIException(String message) {
        this(null, message);
    }

    public NoPermissionAPIException(String message, Object... params) {
        this(null, message, params);
    }

    public NoPermissionAPIException(String data, String message, Object... params) {
        super(RestCodeEnum.NoPermissionAPIException, StrUtil.format(message, params), data);
    }
}