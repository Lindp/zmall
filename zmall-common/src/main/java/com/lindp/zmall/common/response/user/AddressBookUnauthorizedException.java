package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户通讯录未授权
*
* @author lindp
* @date 2020/9/24
*/
public class AddressBookUnauthorizedException extends CommonException {

    public AddressBookUnauthorizedException() {
        this(null, RestCodeEnum.AddressBookUnauthorizedException.getMessage());
    }

    public AddressBookUnauthorizedException(String message) {
        this(null, message);
    }

    public AddressBookUnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public AddressBookUnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.AddressBookUnauthorizedException, StrUtil.format(message, params), data);
    }
}