package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 访问未授权
*
* @author lindp
* @date 2020/9/24
*/
public class UnauthorizedException extends CommonException {

    public UnauthorizedException() {
        this(null, RestCodeEnum.UnauthorizedException.getMessage());
    }

    public UnauthorizedException(String message) {
        this(null, message);
    }

    public UnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public UnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.UnauthorizedException, StrUtil.format(message, params), data);
    }
}