package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户文件未授权
*
* @author lindp
* @date 2020/9/24
*/
public class FileUnauthorizedException extends CommonException {

    public FileUnauthorizedException() {
        this(null, RestCodeEnum.FileUnauthorizedException.getMessage());
    }

    public FileUnauthorizedException(String message) {
        this(null, message);
    }

    public FileUnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public FileUnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.FileUnauthorizedException, StrUtil.format(message, params), data);
    }
}