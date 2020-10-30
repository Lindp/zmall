package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户操作请等待
*
* @author lindp
* @date 2020/9/24
*/
public class OperateWaitingException extends CommonException {

    public OperateWaitingException() {
        this(null, RestCodeEnum.OperateWaitingException.getMessage());
    }

    public OperateWaitingException(String message) {
        this(null, message);
    }

    public OperateWaitingException(String message, Object... params) {
        this(null, message, params);
    }

    public OperateWaitingException(String data, String message, Object... params) {
        super(RestCodeEnum.OperateWaitingException, StrUtil.format(message, params), data);
    }
}