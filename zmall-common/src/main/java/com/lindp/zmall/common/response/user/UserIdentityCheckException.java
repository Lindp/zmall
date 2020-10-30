package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户身份校验失败
*
* @author lindp
* @date 2020/9/24
*/
public class UserIdentityCheckException extends CommonException {

    public UserIdentityCheckException() {
        this(null, RestCodeEnum.UserIdentityCheckException.getMessage());
    }

    public UserIdentityCheckException(String message) {
        this(null, message);
    }

    public UserIdentityCheckException(String message, Object... params) {
        this(null, message, params);
    }

    public UserIdentityCheckException(String data, String message, Object... params) {
        super(RestCodeEnum.UserIdentityCheckException, StrUtil.format(message, params), data);
    }
}