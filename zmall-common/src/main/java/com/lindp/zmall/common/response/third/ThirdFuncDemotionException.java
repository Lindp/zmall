package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 第三方功能降级
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdFuncDemotionException extends CommonException {

    public ThirdFuncDemotionException() {
        this(null, RestCodeEnum.ThirdFuncDemotionException.getMessage());
    }

    public ThirdFuncDemotionException(String message) {
        this(null, message);
    }

    public ThirdFuncDemotionException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdFuncDemotionException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdFuncDemotionException, StrUtil.format(message, params), data);
    }
}