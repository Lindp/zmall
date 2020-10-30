package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 黑名单用户
*
* @author lindp
* @date 2020/9/24
*/
public class BlacklistUserException extends CommonException {

    public BlacklistUserException() {
        this(null, RestCodeEnum.BlacklistUserException.getMessage());
    }

    public BlacklistUserException(String message) {
        this(null, message);
    }

    public BlacklistUserException(String message, Object... params) {
        this(null, message, params);
    }

    public BlacklistUserException(String data, String message, Object... params) {
        super(RestCodeEnum.BlacklistUserException, StrUtil.format(message, params), data);
    }
}