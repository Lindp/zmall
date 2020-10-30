package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户上传文件异常
*
* @author lindp
* @date 2020/9/24
*/
public class UploadFileException extends CommonException {

    public UploadFileException() {
        this(null, RestCodeEnum.UploadFileException.getMessage());
    }

    public UploadFileException(String message) {
        this(null, message);
    }

    public UploadFileException(String message, Object... params) {
        this(null, message, params);
    }

    public UploadFileException(String data, String message, Object... params) {
        super(RestCodeEnum.UploadFileException, StrUtil.format(message, params), data);
    }
}