package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 文件侵犯版权
*
* @author lindp
* @date 2020/9/24
*/
public class FileCopyrightException extends CommonException {

    public FileCopyrightException() {
        this(null, RestCodeEnum.FileCopyrightException.getMessage());
    }

    public FileCopyrightException(String message) {
        this(null, message);
    }

    public FileCopyrightException(String message, Object... params) {
        this(null, message, params);
    }

    public FileCopyrightException(String data, String message, Object... params) {
        super(RestCodeEnum.FileCopyrightException, StrUtil.format(message, params), data);
    }
}