package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户上传压缩文件太大
*
* @author lindp
* @date 2020/9/24
*/
public class UploadZipBigException extends CommonException {

    public UploadZipBigException() {
        this(null, RestCodeEnum.UploadZipBigException.getMessage());
    }

    public UploadZipBigException(String message) {
        this(null, message);
    }

    public UploadZipBigException(String message, Object... params) {
        this(null, message, params);
    }

    public UploadZipBigException(String data, String message, Object... params) {
        super(RestCodeEnum.UploadZipBigException, StrUtil.format(message, params), data);
    }
}