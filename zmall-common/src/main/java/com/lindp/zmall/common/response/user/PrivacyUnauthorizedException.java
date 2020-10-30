package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户隐私未授权
*
* @author lindp
* @date 2020/9/24
*/
public class PrivacyUnauthorizedException extends CommonException {

    public PrivacyUnauthorizedException() {
        this(null, RestCodeEnum.PrivacyUnauthorizedException.getMessage());
    }

    public PrivacyUnauthorizedException(String message) {
        this(null, message);
    }

    public PrivacyUnauthorizedException(String message, Object... params) {
        this(null, message, params);
    }

    public PrivacyUnauthorizedException(String data, String message, Object... params) {
        super(RestCodeEnum.PrivacyUnauthorizedException, StrUtil.format(message, params), data);
    }
}