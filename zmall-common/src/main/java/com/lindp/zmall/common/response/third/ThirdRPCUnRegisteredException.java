package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* RPC 服务未注册
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdRPCUnRegisteredException extends CommonException {

    public ThirdRPCUnRegisteredException() {
        this(null, RestCodeEnum.ThirdRPCUnRegisteredException.getMessage());
    }

    public ThirdRPCUnRegisteredException(String message) {
        this(null, message);
    }

    public ThirdRPCUnRegisteredException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdRPCUnRegisteredException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdRPCUnRegisteredException, StrUtil.format(message, params), data);
    }
}