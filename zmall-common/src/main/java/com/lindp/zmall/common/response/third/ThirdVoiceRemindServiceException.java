package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 语音提醒服务失败
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdVoiceRemindServiceException extends CommonException {

    public ThirdVoiceRemindServiceException() {
        this(null, RestCodeEnum.ThirdVoiceRemindServiceException.getMessage());
    }

    public ThirdVoiceRemindServiceException(String message) {
        this(null, message);
    }

    public ThirdVoiceRemindServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdVoiceRemindServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdVoiceRemindServiceException, StrUtil.format(message, params), data);
    }
}