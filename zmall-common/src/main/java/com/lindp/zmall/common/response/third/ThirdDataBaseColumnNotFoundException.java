package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 列不存在
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDataBaseColumnNotFoundException extends CommonException {

    public ThirdDataBaseColumnNotFoundException() {
        this(null, RestCodeEnum.ThirdDataBaseColumnNotFoundException.getMessage());
    }

    public ThirdDataBaseColumnNotFoundException(String message) {
        this(null, message);
    }

    public ThirdDataBaseColumnNotFoundException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDataBaseColumnNotFoundException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDataBaseColumnNotFoundException, StrUtil.format(message, params), data);
    }
}