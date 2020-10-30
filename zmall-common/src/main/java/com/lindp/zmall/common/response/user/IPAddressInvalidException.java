package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 非法 IP 地址
*
* @author lindp
* @date 2020/9/24
*/
public class IPAddressInvalidException extends CommonException {

    public IPAddressInvalidException() {
        this(null, RestCodeEnum.IPAddressInvalidException.getMessage());
    }

    public IPAddressInvalidException(String message) {
        this(null, message);
    }

    public IPAddressInvalidException(String message, Object... params) {
        this(null, message, params);
    }

    public IPAddressInvalidException(String data, String message, Object... params) {
        super(RestCodeEnum.IPAddressInvalidException, StrUtil.format(message, params), data);
    }
}