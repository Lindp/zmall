package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户摄像头未授权
*
* @author lindp
* @date 2020/9/24
*/
public class CameraDeviceUnauthorizedException extends CommonException {

    public CameraDeviceUnauthorizedException() {
        this(null, RestCodeEnum.CameraDeviceUnauthorizedException.getMessage());
    }

    public CameraDeviceUnauthorizedException(String message) {
        this(null, message);
    }

    public CameraDeviceUnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public CameraDeviceUnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.CameraDeviceUnauthorizedException, StrUtil.format(message, params), data);
    }
}