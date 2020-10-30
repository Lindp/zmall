package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 短信提醒服务失败
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdSmsRemindServiceException extends CommonException {

    public ThirdSmsRemindServiceException() {
        this(null, RestCodeEnum.ThirdSmsRemindServiceException.getMessage());
    }

    public ThirdSmsRemindServiceException(String message) {
        this(null, message);
    }

    public ThirdSmsRemindServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdSmsRemindServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdSmsRemindServiceException, StrUtil.format(message, params), data);
    }
}