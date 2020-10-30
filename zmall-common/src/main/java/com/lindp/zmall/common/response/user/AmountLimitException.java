package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 金额超出限制
*
* @author lindp
* @date 2020/9/24
*/
public class AmountLimitException extends CommonException {

    public AmountLimitException() {
        this(null, RestCodeEnum.AmountLimitException.getMessage());
    }

    public AmountLimitException(String message) {
        this(null, message);
    }

    public AmountLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public AmountLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.AmountLimitException, StrUtil.format(message, params), data);
    }
}