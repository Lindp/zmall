package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 注册国家或地区受限
*
* @author lindp
* @date 2020/9/24
*/
public class RegisterNationOrRegionException extends CommonException {

    public RegisterNationOrRegionException() {
        this(null, RestCodeEnum.RegisterNationOrRegionException.getMessage());
    }

    public RegisterNationOrRegionException(String message) {
        this(null, message);
    }

    public RegisterNationOrRegionException(String message, Object... params) {
        this(null, message, params);
    }

    public RegisterNationOrRegionException(String data, String message, Object... params) {
        super(RestCodeEnum.RegisterNationOrRegionException, StrUtil.format(message, params), data);
    }
}