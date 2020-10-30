package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 数据库服务超时
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDataBaseTimeoutException extends CommonException {

    public ThirdDataBaseTimeoutException() {
        this(null, RestCodeEnum.ThirdDataBaseTimeoutException.getMessage());
    }

    public ThirdDataBaseTimeoutException(String message) {
        this(null, message);
    }

    public ThirdDataBaseTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDataBaseTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDataBaseTimeoutException, StrUtil.format(message, params), data);
    }
}