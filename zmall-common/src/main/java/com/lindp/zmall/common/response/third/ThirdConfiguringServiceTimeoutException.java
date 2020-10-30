package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 配置服务超时
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdConfiguringServiceTimeoutException extends CommonException {

    public ThirdConfiguringServiceTimeoutException() {
        this(null, RestCodeEnum.ThirdConfiguringServiceTimeoutException.getMessage());
    }

    public ThirdConfiguringServiceTimeoutException(String message) {
        this(null, message);
    }

    public ThirdConfiguringServiceTimeoutException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdConfiguringServiceTimeoutException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdConfiguringServiceTimeoutException, StrUtil.format(message, params), data);
    }
}