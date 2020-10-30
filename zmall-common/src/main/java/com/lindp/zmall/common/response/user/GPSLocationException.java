package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户 GPS 定位异常
*
* @author lindp
* @date 2020/9/24
*/
public class GPSLocationException extends CommonException {

    public GPSLocationException() {
        this(null, RestCodeEnum.GPSLocationException.getMessage());
    }

    public GPSLocationException(String message) {
        this(null, message);
    }

    public GPSLocationException(String message, Object... params) {
        this(null, message, params);
    }

    public GPSLocationException(String data, String message, Object... params) {
        super(RestCodeEnum.GPSLocationException, StrUtil.format(message, params), data);
    }
}