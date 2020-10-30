package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 用户输入内容非法
*
* @author lindp
* @date 2020/9/24
*/
public class InputIllegalException extends CommonException {

    public InputIllegalException() {
        this(null, RestCodeEnum.InputIllegalException.getMessage());
    }

    public InputIllegalException(String message) {
        this(null, message);
    }

    public InputIllegalException(String message, Object... params) {
        this(null, message, params);
    }

    public InputIllegalException(String data, String message, Object... params) {
        super(RestCodeEnum.InputIllegalException, StrUtil.format(message, params), data);
    }
}