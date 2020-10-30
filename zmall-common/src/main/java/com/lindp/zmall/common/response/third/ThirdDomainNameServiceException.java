package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 域名解析服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDomainNameServiceException extends CommonException {

    public ThirdDomainNameServiceException() {
        this(null, RestCodeEnum.ThirdDomainNameServiceException.getMessage());
    }

    public ThirdDomainNameServiceException(String message) {
        this(null, message);
    }

    public ThirdDomainNameServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDomainNameServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDomainNameServiceException, StrUtil.format(message, params), data);
    }
}