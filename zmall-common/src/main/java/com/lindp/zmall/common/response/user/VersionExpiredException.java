package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户安装版本已过期
*
* @author lindp
* @date 2020/9/24
*/
public class VersionExpiredException extends CommonException {

    public VersionExpiredException() {
        this(null, RestCodeEnum.VersionExpiredException.getMessage());
    }

    public VersionExpiredException(String message) {
        this(null, message);
    }

    public VersionExpiredException(String message, Object... params) {
        this(null, message, params);
    }

    public VersionExpiredException(String data, String message, Object... params) {
        super(RestCodeEnum.VersionExpiredException, StrUtil.format(message, params), data);
    }
}