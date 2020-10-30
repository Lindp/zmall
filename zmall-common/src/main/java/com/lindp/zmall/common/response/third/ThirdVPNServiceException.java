package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* VPN 服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdVPNServiceException extends CommonException {

    public ThirdVPNServiceException() {
        this(null, RestCodeEnum.ThirdVPNServiceException.getMessage());
    }

    public ThirdVPNServiceException(String message) {
        this(null, message);
    }

    public ThirdVPNServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdVPNServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdVPNServiceException, StrUtil.format(message, params), data);
    }
}