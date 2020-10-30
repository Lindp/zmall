package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户 API 请求版本不匹配
*
* @author lindp
* @date 2020/9/24
*/
public class VersionApiMatchException extends CommonException {

    public VersionApiMatchException() {
        this(null, RestCodeEnum.VersionApiMatchException.getMessage());
    }

    public VersionApiMatchException(String message) {
        this(null, message);
    }

    public VersionApiMatchException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionApiMatchException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionApiMatchException, StrUtil.format(message, params), data);
    }
}