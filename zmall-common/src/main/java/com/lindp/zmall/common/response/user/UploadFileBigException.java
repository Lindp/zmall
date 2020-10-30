package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户上传文件太大
*
* @author lindp
* @date 2020/9/24
*/
public class UploadFileBigException extends CommonException {

    public UploadFileBigException() {
        this(null, RestCodeEnum.UploadFileBigException.getMessage());
    }

    public UploadFileBigException(String message) {
        this(null, message);
    }

    public UploadFileBigException(String message, Object... params) {
        this(null, message, params);
    }

    public UploadFileBigException(String data, String message, Object... params) {
        super(RestCodeEnum.UploadFileBigException, StrUtil.format(message, params), data);
    }
}