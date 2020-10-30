package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 第三方系统限流
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdLimitException extends CommonException {

    public ThirdLimitException() {
        this(null, RestCodeEnum.ThirdLimitException.getMessage());
    }

    public ThirdLimitException(String message) {
        this(null, message);
    }

    public ThirdLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdLimitException, StrUtil.format(message, params), data);
    }
}