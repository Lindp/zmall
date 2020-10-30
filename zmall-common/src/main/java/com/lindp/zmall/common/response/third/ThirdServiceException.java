package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 调用第三方服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdServiceException extends CommonException {

    public ThirdServiceException() {
        this(null, RestCodeEnum.ThirdServiceException.getMessage());
    }

    public ThirdServiceException(String message) {
        this(null, message);
    }

    public ThirdServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdServiceException, StrUtil.format(message, params), data);
    }
}