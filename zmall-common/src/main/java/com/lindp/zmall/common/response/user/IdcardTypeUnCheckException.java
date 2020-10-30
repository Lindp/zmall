package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户证件类型未选择
*
* @author lindp
* @date 2020/9/24
*/
public class IdcardTypeUnCheckException extends CommonException {

    public IdcardTypeUnCheckException() {
        this(null, RestCodeEnum.IdcardTypeUnCheckException.getMessage());
    }

    public IdcardTypeUnCheckException(String message) {
        this(null, message);
    }

    public IdcardTypeUnCheckException(String message, Object... params) {
        this(null, message, params);
    }

    public IdcardTypeUnCheckException(String data, String message, Object... params) {
        super(RestCodeEnum.IdcardTypeUnCheckException, StrUtil.format(message, params), data);
    }
}