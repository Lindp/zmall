package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 数量超出限制
*
* @author lindp
* @date 2020/9/24
*/
public class NumberLimitException extends CommonException {

    public NumberLimitException() {
        this(null, RestCodeEnum.NumberLimitException.getMessage());
    }

    public NumberLimitException(String message) {
        this(null, message);
    }

    public NumberLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public NumberLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.NumberLimitException, StrUtil.format(message, params), data);
    }
}