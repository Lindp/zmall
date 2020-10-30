package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户内存空间不足
*
* @author lindp
* @date 2020/9/24
*/
public class UserNotMemoryException extends CommonException {

    public UserNotMemoryException() {
        this(null, RestCodeEnum.UserNotMemoryException.getMessage());
    }

    public UserNotMemoryException(String message) {
        this(null, message);
    }

    public UserNotMemoryException(String message, Object... params) {
        this(null, message, params);
    }

    public UserNotMemoryException(String data, String message, Object... params) {
        super(RestCodeEnum.UserNotMemoryException, StrUtil.format(message, params), data);
    }
}