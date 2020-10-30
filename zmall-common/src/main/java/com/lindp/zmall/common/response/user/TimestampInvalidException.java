package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 非法的时间戳参数
*
* @author lindp
* @date 2020/9/24
*/
public class TimestampInvalidException extends CommonException {

    public TimestampInvalidException() {
        this(null, RestCodeEnum.TimestampInvalidException.getMessage());
    }

    public TimestampInvalidException(String message) {
        this(null, message);
    }

    public TimestampInvalidException(String message, Object... params) {
        this(null, message, params);
    }

    public TimestampInvalidException(String data, String message, Object... params) {
        super(RestCodeEnum.TimestampInvalidException, StrUtil.format(message, params), data);
    }
}