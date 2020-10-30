package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户上传视频太大
*
* @author lindp
* @date 2020/9/24
*/
public class UploadVideoBigException extends CommonException {

    public UploadVideoBigException() {
        this(null, RestCodeEnum.UploadVideoBigException.getMessage());
    }

    public UploadVideoBigException(String message) {
        this(null, message);
    }

    public UploadVideoBigException(String message, Object... params) {
        this(null, message, params);
    }

    public UploadVideoBigException(String data, String message, Object... params) {
        super(RestCodeEnum.UploadVideoBigException, StrUtil.format(message, params), data);
    }
}