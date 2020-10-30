package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 表不存在
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDataBaseTableNotFoundException extends CommonException {

    public ThirdDataBaseTableNotFoundException() {
        this(null, RestCodeEnum.ThirdDataBaseTableNotFoundException.getMessage());
    }

    public ThirdDataBaseTableNotFoundException(String message) {
        this(null, message);
    }

    public ThirdDataBaseTableNotFoundException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDataBaseTableNotFoundException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDataBaseTableNotFoundException, StrUtil.format(message, params), data);
    }
}