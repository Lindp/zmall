package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 用户隐私未签署
*
* @author lindp
* @date 2020/9/24
*/
public class PrivacyUnsignedException extends CommonException {

    public PrivacyUnsignedException() {
        this(null, RestCodeEnum.PrivacyUnsignedException.getMessage());
    }

    public PrivacyUnsignedException(String message) {
        this(null, message);
    }

    public PrivacyUnsignedException(String message, Object... params) {
        this(null, message, params);
    }

    public PrivacyUnsignedException(String data, String message, Object... params) {
        super(RestCodeEnum.PrivacyUnsignedException, StrUtil.format(message, params), data);
    }
}