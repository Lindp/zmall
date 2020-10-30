package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户安装版本与系统不匹配
*
* @author lindp
* @date 2020/9/24
*/
public class VersionNeSystemException extends CommonException {

    public VersionNeSystemException() {
        this(null, RestCodeEnum.VersionNeSystemException.getMessage());
    }

    public VersionNeSystemException(String message) {
        this(null, message);
    }

    public VersionNeSystemException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionNeSystemException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionNeSystemException, StrUtil.format(message, params), data);
    }
}