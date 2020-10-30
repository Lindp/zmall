package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 数据库服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDataBaseException extends CommonException {

    public ThirdDataBaseException() {
        this(null, RestCodeEnum.ThirdDataBaseException.getMessage());
    }

    public ThirdDataBaseException(String message) {
        this(null, message);
    }

    public ThirdDataBaseException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDataBaseException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDataBaseException, StrUtil.format(message, params), data);
    }
}