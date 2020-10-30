package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* RPC 服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdRPCException extends CommonException {

    public ThirdRPCException() {
        this(null, RestCodeEnum.ThirdRPCException.getMessage());
    }

    public ThirdRPCException(String message) {
        this(null, message);
    }

    public ThirdRPCException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdRPCException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdRPCException, StrUtil.format(message, params), data);
    }
}