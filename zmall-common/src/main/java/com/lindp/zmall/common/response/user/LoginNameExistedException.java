package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户名已存在
*
* @author lindp
* @date 2020/9/24
*/
public class LoginNameExistedException extends CommonException {

    public LoginNameExistedException() {
        this(null, RestCodeEnum.LoginNameExistedException.getMessage());
    }

    public LoginNameExistedException(String message) {
        this(null, message);
    }

    public LoginNameExistedException(String message, Object... params) {
        this(null, message, params);
    }

    public LoginNameExistedException(String data, String message, Object... params) {
        super(RestCodeEnum.LoginNameExistedException, StrUtil.format(message, params), data);
    }
}