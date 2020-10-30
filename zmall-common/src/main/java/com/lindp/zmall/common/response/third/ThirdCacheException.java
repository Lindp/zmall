package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 缓存服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdCacheException extends CommonException {

    public ThirdCacheException() {
        this(null, RestCodeEnum.ThirdCacheException.getMessage());
    }

    public ThirdCacheException(String message) {
        this(null, message);
    }

    public ThirdCacheException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdCacheException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdCacheException, StrUtil.format(message, params), data);
    }
}