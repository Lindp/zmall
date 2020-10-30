package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 地址格式校验失败
*
* @author lindp
* @date 2020/9/24
*/
public class AddrFormatException extends CommonException {

    public AddrFormatException() {
        this(null, RestCodeEnum.AddrFormatException.getMessage());
    }

    public AddrFormatException(String message) {
        this(null, message);
    }

    public AddrFormatException(String message, Object... params) {
        this(null, message, params);
    }

    public AddrFormatException(String data, String message, Object... params) {
        super(RestCodeEnum.AddrFormatException, StrUtil.format(message, params), data);
    }
}