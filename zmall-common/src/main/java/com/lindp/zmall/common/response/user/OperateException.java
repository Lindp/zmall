package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户操作异常
*
* @author lindp
* @date 2020/9/24
*/
public class OperateException extends CommonException {

    public OperateException() {
        this(null, RestCodeEnum.OperateException.getMessage());
    }

    public OperateException(String message) {
        this(null, message);
    }

    public OperateException(String message, Object... params) {
        this(null, message, params);
    }

    public OperateException(String data, String message, Object... params) {
        super(RestCodeEnum.OperateException, StrUtil.format(message, params), data);
    }
}