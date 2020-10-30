package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 账户余额不足
*
* @author lindp
* @date 2020/9/24
*/
public class UserNotBalanceException extends CommonException {

    public UserNotBalanceException() {
        this(null, RestCodeEnum.UserNotBalanceException.getMessage());
    }

    public UserNotBalanceException(String message) {
        this(null, message);
    }

    public UserNotBalanceException(String message, Object... params) {
        this(null, message, params);
    }

    public UserNotBalanceException(String data, String message, Object... params) {
        super(RestCodeEnum.UserNotBalanceException, StrUtil.format(message, params), data);
    }
}