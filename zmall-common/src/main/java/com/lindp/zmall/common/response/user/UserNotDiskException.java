package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户磁盘空间不足
*
* @author lindp
* @date 2020/9/24
*/
public class UserNotDiskException extends CommonException {

    public UserNotDiskException() {
        this(null, RestCodeEnum.UserNotDiskException.getMessage());
    }

    public UserNotDiskException(String message) {
        this(null, message);
    }

    public UserNotDiskException(String message, Object... params) {
        this(null, message, params);
    }

    public UserNotDiskException(String data, String message, Object... params) {
        super(RestCodeEnum.UserNotDiskException, StrUtil.format(message, params), data);
    }
}