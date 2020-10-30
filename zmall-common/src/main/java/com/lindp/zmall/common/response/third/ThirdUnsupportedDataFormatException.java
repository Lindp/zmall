package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 不支持的数据格式
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdUnsupportedDataFormatException extends CommonException {

    public ThirdUnsupportedDataFormatException() {
        this(null, RestCodeEnum.ThirdUnsupportedDataFormatException.getMessage());
    }

    public ThirdUnsupportedDataFormatException(String message) {
        this(null, message);
    }

    public ThirdUnsupportedDataFormatException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdUnsupportedDataFormatException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdUnsupportedDataFormatException, StrUtil.format(message, params), data);
    }
}