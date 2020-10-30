package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户上传图片太大
*
* @author lindp
* @date 2020/9/24
*/
public class UploadImageBigException extends CommonException {

    public UploadImageBigException() {
        this(null, RestCodeEnum.UploadImageBigException.getMessage());
    }

    public UploadImageBigException(String message) {
        this(null, message);
    }

    public UploadImageBigException(String message, Object... params) {
        this(null, message, params);
    }

    public UploadImageBigException(String data, String message, Object... params) {
        super(RestCodeEnum.UploadImageBigException, StrUtil.format(message, params), data);
    }
}