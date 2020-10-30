package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 缓存服务超时
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdCacheServiceTimeoutException extends CommonException {

    public ThirdCacheServiceTimeoutException() {
        this(null, RestCodeEnum.ThirdCacheServiceTimeoutException.getMessage());
    }

    public ThirdCacheServiceTimeoutException(String message) {
        this(null, message);
    }

    public ThirdCacheServiceTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdCacheServiceTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdCacheServiceTimeoutException, StrUtil.format(message, params), data);
    }
}