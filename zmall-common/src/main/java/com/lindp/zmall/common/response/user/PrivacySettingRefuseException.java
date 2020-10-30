package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 因访问对象隐私设置被拦截
*
* @author lindp
* @date 2020/9/24
*/
public class PrivacySettingRefuseException extends CommonException {

    public PrivacySettingRefuseException() {
        this(null, RestCodeEnum.PrivacySettingRefuseException.getMessage());
    }

    public PrivacySettingRefuseException(String message) {
        this(null, message);
    }

    public PrivacySettingRefuseException(String message, Object... params) {
        this(null, message, params);
    }

    public PrivacySettingRefuseException(String data, String message, Object... params) {
        super(RestCodeEnum.PrivacySettingRefuseException, StrUtil.format(message, params), data);
    }
}