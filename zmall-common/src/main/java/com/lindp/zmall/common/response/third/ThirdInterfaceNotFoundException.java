package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 接口不存在
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdInterfaceNotFoundException extends CommonException {

    public ThirdInterfaceNotFoundException() {
        this(null, RestCodeEnum.ThirdInterfaceNotFoundException.getMessage());
    }

    public ThirdInterfaceNotFoundException(String message) {
        this(null, message);
    }

    public ThirdInterfaceNotFoundException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdInterfaceNotFoundException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdInterfaceNotFoundException, StrUtil.format(message, params), data);
    }
}