package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户未获得第三方登陆授权
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdLoginException extends CommonException {

    public ThirdLoginException() {
        this(null, RestCodeEnum.ThirdLoginException.getMessage());
    }

    public ThirdLoginException(String message) {
        this(null, message);
    }

    public ThirdLoginException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdLoginException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdLoginException, StrUtil.format(message, params), data);
    }
}