package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* RPC 服务未找到
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdRPCNotFoundException extends CommonException {

    public ThirdRPCNotFoundException() {
        this(null, RestCodeEnum.ThirdRPCNotFoundException.getMessage());
    }

    public ThirdRPCNotFoundException(String message) {
        this(null, message);
    }

    public ThirdRPCNotFoundException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdRPCNotFoundException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdRPCNotFoundException, StrUtil.format(message, params), data);
    }
}