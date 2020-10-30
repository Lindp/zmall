package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户面容识别失败
*
* @author lindp
* @date 2020/9/24
*/
public class FaceException extends CommonException {

    public FaceException() {
        this(null, RestCodeEnum.FaceException.getMessage());
    }

    public FaceException(String message) {
        this(null, message);
    }

    public FaceException(String message, Object... params) {
        this(null, message, params);
    }

    public FaceException(String data, String message, Object... params) {
        super(RestCodeEnum.FaceException, StrUtil.format(message, params), data);
    }
}