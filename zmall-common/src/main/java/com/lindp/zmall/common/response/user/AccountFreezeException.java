package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 账号被冻结
*
* @author lindp
* @date 2020/9/24
*/
public class AccountFreezeException extends CommonException {

    public AccountFreezeException() {
        this(null, RestCodeEnum.AccountFreezeException.getMessage());
    }

    public AccountFreezeException(String message) {
        this(null, message);
    }

    public AccountFreezeException(String message, Object... params) {
        this(null, message, params);
    }

    public AccountFreezeException(String data, String message, Object... params) {
        super(RestCodeEnum.AccountFreezeException, StrUtil.format(message, params), data);
    }
}