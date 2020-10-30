package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户端错误
*
* @author lindp
* @date 2020/9/24
*/
public class ClientException extends CommonException {

    public ClientException() {
        this(null, RestCodeEnum.ClientException.getMessage());
    }

    public ClientException(String message) {
        this(null, message);
    }

    public ClientException(String message, Object... params) {
        this(null, message, params);
    }

    public ClientException(String data, String message, Object... params) {
        super(RestCodeEnum.ClientException, StrUtil.format(message, params), data);
    }
}