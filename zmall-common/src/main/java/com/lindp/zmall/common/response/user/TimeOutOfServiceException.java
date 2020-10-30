package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 时间不在服务范围
*
* @author lindp
* @date 2020/9/24
*/
public class TimeOutOfServiceException extends CommonException {

    public TimeOutOfServiceException() {
        this(null, RestCodeEnum.TimeOutOfServiceException.getMessage());
    }

    public TimeOutOfServiceException(String message) {
        this(null, message);
    }

    public TimeOutOfServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public TimeOutOfServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.TimeOutOfServiceException, StrUtil.format(message, params), data);
    }
}