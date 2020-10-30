package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户安装版本过低
*
* @author lindp
* @date 2020/9/24
*/
public class VersionLowException extends CommonException {

    public VersionLowException() {
        this(null, RestCodeEnum.VersionLowException.getMessage());
    }

    public VersionLowException(String message) {
        this(null, message);
    }

    public VersionLowException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionLowException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionLowException, StrUtil.format(message, params), data);
    }
}