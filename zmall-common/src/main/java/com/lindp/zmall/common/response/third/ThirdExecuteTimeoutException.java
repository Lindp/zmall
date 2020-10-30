package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 第三方系统执行超时
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdExecuteTimeoutException extends CommonException {

    public ThirdExecuteTimeoutException() {
        this(null, RestCodeEnum.ThirdExecuteTimeoutException.getMessage());
    }

    public ThirdExecuteTimeoutException(String message) {
        this(null, message);
    }

    public ThirdExecuteTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdExecuteTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdExecuteTimeoutException, StrUtil.format(message, params), data);
    }
}