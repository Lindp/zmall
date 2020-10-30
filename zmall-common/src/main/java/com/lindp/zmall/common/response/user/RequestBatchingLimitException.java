package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 请求批量处理总个数超出限制
*
* @author lindp
* @date 2020/9/24
*/
public class RequestBatchingLimitException extends CommonException {

    public RequestBatchingLimitException() {
        this(null, RestCodeEnum.RequestBatchingLimitException.getMessage());
    }

    public RequestBatchingLimitException(String message) {
        this(null, message);
    }

    public RequestBatchingLimitException(String message, Object... params) {
        this(null, message, params);
    }

    public RequestBatchingLimitException(String data, String message, Object... params) {
        super(RestCodeEnum.RequestBatchingLimitException, StrUtil.format(message, params), data);
    }
}