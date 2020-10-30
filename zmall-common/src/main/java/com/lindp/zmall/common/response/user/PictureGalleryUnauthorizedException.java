package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户图片库未授权
*
* @author lindp
* @date 2020/9/24
*/
public class PictureGalleryUnauthorizedException extends CommonException {

    public PictureGalleryUnauthorizedException() {
        this(null, RestCodeEnum.PictureGalleryUnauthorizedException.getMessage());
    }

    public PictureGalleryUnauthorizedException(String message) {
        this(null, message);
    }

    public PictureGalleryUnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public PictureGalleryUnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.PictureGalleryUnauthorizedException, StrUtil.format(message, params), data);
    }
}