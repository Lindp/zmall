package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 系统磁盘空间耗尽
*
* @author lindp
* @date 2020/9/24
*/
public class SystemNotDiskException extends CommonException {

    public SystemNotDiskException() {
        this(null, RestCodeEnum.SystemNotDiskException.getMessage());
    }

    public SystemNotDiskException(String message) {
        this(null, message);
    }

    public SystemNotDiskException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemNotDiskException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemNotDiskException, StrUtil.format(message, params), data);
    }
}