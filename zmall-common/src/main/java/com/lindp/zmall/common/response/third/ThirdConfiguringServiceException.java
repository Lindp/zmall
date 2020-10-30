package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 配置服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdConfiguringServiceException extends CommonException {

    public ThirdConfiguringServiceException() {
        this(null, RestCodeEnum.ThirdConfiguringServiceException.getMessage());
    }

    public ThirdConfiguringServiceException(String message) {
        this(null, message);
    }

    public ThirdConfiguringServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdConfiguringServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdConfiguringServiceException, StrUtil.format(message, params), data);
    }
}