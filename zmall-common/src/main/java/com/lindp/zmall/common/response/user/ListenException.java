package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户听筒异常
*
* @author lindp
* @date 2020/9/24
*/
public class ListenException extends CommonException {

    public ListenException() {
        this(null, RestCodeEnum.ListenException.getMessage());
    }

    public ListenException(String message) {
        this(null, message);
    }

    public ListenException(String message, Object... params) {
        this(null, message, params);
    }

    public ListenException(String data, String message, Object... params) {
        super(RestCodeEnum.ListenException, StrUtil.format(message, params), data);
    }
}