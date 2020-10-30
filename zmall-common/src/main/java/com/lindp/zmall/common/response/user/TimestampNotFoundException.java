package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 缺少时间戳参数
*
* @author lindp
* @date 2020/9/24
*/
public class TimestampNotFoundException extends CommonException {

    public TimestampNotFoundException() {
        this(null, RestCodeEnum.TimestampNotFoundException.getMessage());
    }

    public TimestampNotFoundException(String message) {
        this(null, message);
    }

    public TimestampNotFoundException(String message, Object... params) {
        this(null, message, params);
    }

    public TimestampNotFoundException(String data, String message, Object... params) {
        super(RestCodeEnum.TimestampNotFoundException, StrUtil.format(message, params), data);
    }
}