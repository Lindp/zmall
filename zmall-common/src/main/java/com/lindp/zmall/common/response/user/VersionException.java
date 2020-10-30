package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户当前版本异常
*
* @author lindp
* @date 2020/9/24
*/
public class VersionException extends CommonException {

    public VersionException() {
        this(null, RestCodeEnum.VersionException.getMessage());
    }

    public VersionException(String message) {
        this(null, message);
    }

    public VersionException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionException, StrUtil.format(message, params), data);
    }
}