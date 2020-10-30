package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户相机未授权
*
* @author lindp
* @date 2020/9/24
*/
public class CameraUnauthorizedException extends CommonException {

    public CameraUnauthorizedException() {
        this(null, RestCodeEnum.CameraUnauthorizedException.getMessage());
    }

    public CameraUnauthorizedException(String message) {
        this(null, message);
    }

    public CameraUnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public CameraUnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.CameraUnauthorizedException, StrUtil.format(message, params), data);
    }
}