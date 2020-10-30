package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 地址不在服务范围
*
* @author lindp
* @date 2020/9/24
*/
public class AddressOutOfServiceException extends CommonException {

    public AddressOutOfServiceException() {
        this(null, RestCodeEnum.AddressOutOfServiceException.getMessage());
    }

    public AddressOutOfServiceException(String message) {
        this(null, message);
    }

    public AddressOutOfServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public AddressOutOfServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.AddressOutOfServiceException, StrUtil.format(message, params), data);
    }
}