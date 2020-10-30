package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户指纹识别失败
*
* @author lindp
* @date 2020/9/24
*/
public class FingerprintException extends CommonException {

    public FingerprintException() {
        this(null, RestCodeEnum.FingerprintException.getMessage());
    }

    public FingerprintException(String message) {
        this(null, message);
    }

    public FingerprintException(String message, Object... params) {
        this(null, message, params);
    }

    public FingerprintException(String data, String message, Object... params) {
        super(RestCodeEnum.FingerprintException, StrUtil.format(message, params), data);
    }
}