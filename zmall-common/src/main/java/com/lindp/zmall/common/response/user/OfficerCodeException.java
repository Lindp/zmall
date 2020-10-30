package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 军官证编号校验非法
*
* @author lindp
* @date 2020/9/24
*/
public class OfficerCodeException extends CommonException {

    public OfficerCodeException() {
        this(null, RestCodeEnum.OfficerCodeException.getMessage());
    }

    public OfficerCodeException(String message) {
        this(null, message);
    }

    public OfficerCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public OfficerCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.OfficerCodeException, StrUtil.format(message, params), data);
    }
}