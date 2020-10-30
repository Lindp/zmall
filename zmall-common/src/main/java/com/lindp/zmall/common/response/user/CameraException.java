package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户相机异常
*
* @author lindp
* @date 2020/9/24
*/
public class CameraException extends CommonException {

    public CameraException() {
        this(null, RestCodeEnum.CameraException.getMessage());
    }

    public CameraException(String message) {
        this(null, message);
    }

    public CameraException(String message, Object... params) {
        this(null, message, params);
    }

    public CameraException(String data, String message, Object... params) {
        super(RestCodeEnum.CameraException, StrUtil.format(message, params), data);
    }
}