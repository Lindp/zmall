package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 邮件提醒服务失败
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdEmailRemindServiceException extends CommonException {

    public ThirdEmailRemindServiceException() {
        this(null, RestCodeEnum.ThirdEmailRemindServiceException.getMessage());
    }

    public ThirdEmailRemindServiceException(String message) {
        this(null, message);
    }

    public ThirdEmailRemindServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdEmailRemindServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdEmailRemindServiceException, StrUtil.format(message, params), data);
    }
}