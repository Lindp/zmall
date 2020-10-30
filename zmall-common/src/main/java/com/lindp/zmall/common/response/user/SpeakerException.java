package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户扬声器异常
*
* @author lindp
* @date 2020/9/24
*/
public class SpeakerException extends CommonException {

    public SpeakerException() {
        this(null, RestCodeEnum.SpeakerException.getMessage());
    }

    public SpeakerException(String message) {
        this(null, message);
    }

    public SpeakerException(String message, Object... params) {
        this(null, message, params);
    }

    public SpeakerException(String data, String message, Object... params) {
        super(RestCodeEnum.SpeakerException, StrUtil.format(message, params), data);
    }
}