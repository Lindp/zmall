package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* CDN 服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdCDNServiceException extends CommonException {

    public ThirdCDNServiceException() {
        this(null, RestCodeEnum.ThirdCDNServiceException.getMessage());
    }

    public ThirdCDNServiceException(String message) {
        this(null, message);
    }

    public ThirdCDNServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdCDNServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdCDNServiceException, StrUtil.format(message, params), data);
    }
}