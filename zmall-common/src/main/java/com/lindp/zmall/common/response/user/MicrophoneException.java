package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户麦克风异常
*
* @author lindp
* @date 2020/9/24
*/
public class MicrophoneException extends CommonException {

    public MicrophoneException() {
        this(null, RestCodeEnum.MicrophoneException.getMessage());
    }

    public MicrophoneException(String message) {
        this(null, message);
    }

    public MicrophoneException(String message, Object... params) {
        this(null, message, params);
    }

    public MicrophoneException(String data, String message, Object... params) {
        super(RestCodeEnum.MicrophoneException, StrUtil.format(message, params), data);
    }
}