package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 系统读取磁盘文件失败
*
* @author lindp
* @date 2020/9/24
*/
public class SystemReadFileException extends CommonException {

    public SystemReadFileException() {
        this(null, RestCodeEnum.SystemReadFileException.getMessage());
    }

    public SystemReadFileException(String message) {
        this(null, message);
    }

    public SystemReadFileException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemReadFileException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemReadFileException, StrUtil.format(message, params), data);
    }
}