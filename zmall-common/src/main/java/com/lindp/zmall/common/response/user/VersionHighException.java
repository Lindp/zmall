package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户安装版本过高
*
* @author lindp
* @date 2020/9/24
*/
public class VersionHighException extends CommonException {

    public VersionHighException() {
        this(null, RestCodeEnum.VersionHighException.getMessage());
    }

    public VersionHighException(String message) {
        this(null, message);
    }

    public VersionHighException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionHighException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionHighException, StrUtil.format(message, params), data);
    }
}