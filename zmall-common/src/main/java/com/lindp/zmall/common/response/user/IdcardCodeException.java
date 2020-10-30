package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 大陆身份证编号校验非法
*
* @author lindp
* @date 2020/9/24
*/
public class IdcardCodeException extends CommonException {

    public IdcardCodeException() {
        this(null, RestCodeEnum.IdcardCodeException.getMessage());
    }

    public IdcardCodeException(String message) {
        this(null, message);
    }

    public IdcardCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public IdcardCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.IdcardCodeException, StrUtil.format(message, params), data);
    }
}