package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 主键冲突
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDataBasePrimarykeyException extends CommonException {

    public ThirdDataBasePrimarykeyException() {
        this(null, RestCodeEnum.ThirdDataBasePrimarykeyException.getMessage());
    }

    public ThirdDataBasePrimarykeyException(String message) {
        this(null, message);
    }

    public ThirdDataBasePrimarykeyException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDataBasePrimarykeyException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDataBasePrimarykeyException, StrUtil.format(message, params), data);
    }
}