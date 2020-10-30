package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 语音校验码输入错误
*
* @author lindp
* @date 2020/9/24
*/
public class VoiceCheckCodeException extends CommonException {

    public VoiceCheckCodeException() {
        this(null, RestCodeEnum.VoiceCheckCodeException.getMessage());
    }

    public VoiceCheckCodeException(String message) {
        this(null, message);
    }

    public VoiceCheckCodeException(String message, Object... params) {
        this(null, message, params);
    }

    public VoiceCheckCodeException(String data, String message, Object... params) {
        super(RestCodeEnum.VoiceCheckCodeException, StrUtil.format(message, params), data);
    }
}