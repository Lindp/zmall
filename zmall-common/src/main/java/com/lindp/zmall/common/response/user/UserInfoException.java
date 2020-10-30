package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户基本信息校验失败
*
* @author lindp
* @date 2020/9/24
*/
public class UserInfoException extends CommonException {

    public UserInfoException() {
        this(null, RestCodeEnum.UserInfoException.getMessage());
    }

    public UserInfoException(String message) {
        this(null, message);
    }

    public UserInfoException(String message, Object... params) {
        this(null, message, params);
    }

    public UserInfoException(String data, String message, Object... params) {
        super(RestCodeEnum.UserInfoException, StrUtil.format(message, params), data);
    }
}