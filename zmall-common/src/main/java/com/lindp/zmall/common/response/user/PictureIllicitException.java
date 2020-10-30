package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 图片包含违禁信息
*
* @author lindp
* @date 2020/9/24
*/
public class PictureIllicitException extends CommonException {

    public PictureIllicitException() {
        this(null, RestCodeEnum.PictureIllicitException.getMessage());
    }

    public PictureIllicitException(String message) {
        this(null, message);
    }

    public PictureIllicitException(String message, Object... params) {
        this(null, message, params);
    }

    public PictureIllicitException(String data, String message, Object... params) {
        super(RestCodeEnum.PictureIllicitException, StrUtil.format(message, params), data);
    }
}