package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 文件句柄耗尽
*
* @author lindp
* @date 2020/9/24
*/
public class SystemFileHandleExhaustedException extends CommonException {

    public SystemFileHandleExhaustedException() {
        this(null, RestCodeEnum.SystemFileHandleExhaustedException.getMessage());
    }

    public SystemFileHandleExhaustedException(String message) {
        this(null, message);
    }

    public SystemFileHandleExhaustedException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemFileHandleExhaustedException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemFileHandleExhaustedException, StrUtil.format(message, params), data);
    }
}