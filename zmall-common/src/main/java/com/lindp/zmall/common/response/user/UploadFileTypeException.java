package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户上传文件类型不匹配
*
* @author lindp
* @date 2020/9/24
*/
public class UploadFileTypeException extends CommonException {

    public UploadFileTypeException() {
        this(null, RestCodeEnum.UploadFileTypeException.getMessage());
    }

    public UploadFileTypeException(String message) {
        this(null, message);
    }

    public UploadFileTypeException(String message, Object... params) {
        this(null, message, params);
    }

    public UploadFileTypeException(String data, String message, Object... params) {
        super(RestCodeEnum.UploadFileTypeException, StrUtil.format(message, params), data);
    }
}