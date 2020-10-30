package com.lindp.zmall.common.response.server;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 系统功能降级
*
* @author lindp
* @date 2020/9/24
*/
public class SystemFuncDemotionException extends CommonException {

    public SystemFuncDemotionException() {
        this(null, RestCodeEnum.SystemFuncDemotionException.getMessage());
    }

    public SystemFuncDemotionException(String message) {
        this(null, message);
    }

    public SystemFuncDemotionException(String message, Object... params) {
        this(null, message, params);
    }

    public SystemFuncDemotionException(String data, String message, Object... params) {
        super(RestCodeEnum.SystemFuncDemotionException, StrUtil.format(message, params), data);
    }
}