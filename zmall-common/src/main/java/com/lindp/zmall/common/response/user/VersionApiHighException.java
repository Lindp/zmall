package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户 API 请求版本过高
*
* @author lindp
* @date 2020/9/24
*/
public class VersionApiHighException extends CommonException {

    public VersionApiHighException() {
        this(null, RestCodeEnum.VersionApiHighException.getMessage());
    }

    public VersionApiHighException(String message) {
        this(null, message);
    }

    public VersionApiHighException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionApiHighException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionApiHighException, StrUtil.format(message, params), data);
    }
}