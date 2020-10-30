package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户配额已用光
*
* @author lindp
* @date 2020/9/24
*/
public class UserNotQuotaException extends CommonException {

    public UserNotQuotaException() {
        this(null, RestCodeEnum.UserNotQuotaException.getMessage());
    }

    public UserNotQuotaException(String message) {
        this(null, message);
    }

    public UserNotQuotaException(String message, Object... params) {
        this(null, message, params);
    }

    public UserNotQuotaException(String data, String message, Object... params) {
        super(RestCodeEnum.UserNotQuotaException, StrUtil.format(message, params), data);
    }
}