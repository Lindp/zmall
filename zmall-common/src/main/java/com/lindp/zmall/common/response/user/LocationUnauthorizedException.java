package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户位置信息未授权
*
* @author lindp
* @date 2020/9/24
*/
public class LocationUnauthorizedException extends CommonException {

    public LocationUnauthorizedException() {
        this(null, RestCodeEnum.LocationUnauthorizedException.getMessage());
    }

    public LocationUnauthorizedException(String message) {
        this(null, message);
    }

    public LocationUnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public LocationUnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.LocationUnauthorizedException, StrUtil.format(message, params), data);
    }
}