package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 第三方容灾系统被触发
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDisasterRecoverException extends CommonException {

    public ThirdDisasterRecoverException() {
        this(null, RestCodeEnum.ThirdDisasterRecoverException.getMessage());
    }

    public ThirdDisasterRecoverException(String message) {
        this(null, message);
    }

    public ThirdDisasterRecoverException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDisasterRecoverException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDisasterRecoverException, StrUtil.format(message, params), data);
    }
}