package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户证件异常
*
* @author lindp
* @date 2020/9/24
*/
public class IdcardException extends CommonException {

    public IdcardException() {
        this(null, RestCodeEnum.IdcardException.getMessage());
    }

    public IdcardException(String message) {
        this(null, message);
    }

    public IdcardException(String message, Object... params) {
        this(null, message, params);
    }

    public IdcardException(String data, String message, Object... params) {
        super(RestCodeEnum.IdcardException, StrUtil.format(message, params), data);
    }
}