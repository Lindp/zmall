package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 存储容量已满
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdStorageFullException extends CommonException {

    public ThirdStorageFullException() {
        this(null, RestCodeEnum.ThirdStorageFullException.getMessage());
    }

    public ThirdStorageFullException(String message) {
        this(null, message);
    }

    public ThirdStorageFullException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdStorageFullException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdStorageFullException, StrUtil.format(message, params), data);
    }
}