package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户授权申请被拒绝
*
* @author lindp
* @date 2020/9/24
*/
public class AuthorizationApplyRefuseException extends CommonException {

    public AuthorizationApplyRefuseException() {
        this(null, RestCodeEnum.AuthorizationApplyRefuseException.getMessage());
    }

    public AuthorizationApplyRefuseException(String message) {
        this(null, message);
    }

    public AuthorizationApplyRefuseException(String message, Object... params) {
        this(null, message, params);
    }

    public AuthorizationApplyRefuseException(String data, String message, Object... params) {
        super(RestCodeEnum.AuthorizationApplyRefuseException, StrUtil.format(message, params), data);
    }
}