package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 多表关联中存在多个相同名称的列
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDataBaseMultipleTableJoinSameColumnException extends CommonException {

    public ThirdDataBaseMultipleTableJoinSameColumnException() {
        this(null, RestCodeEnum.ThirdDataBaseMultipleTableJoinSameColumnException.getMessage());
    }

    public ThirdDataBaseMultipleTableJoinSameColumnException(String message) {
        this(null, message);
    }

    public ThirdDataBaseMultipleTableJoinSameColumnException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDataBaseMultipleTableJoinSameColumnException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDataBaseMultipleTableJoinSameColumnException, StrUtil.format(message, params), data);
    }
}