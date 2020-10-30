package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 无效的用户输入
*
* @author lindp
* @date 2020/9/24
*/
public class InputInvalidException extends CommonException {

    public InputInvalidException() {
        this(null, RestCodeEnum.InputInvalidException.getMessage());
    }

    public InputInvalidException(String message) {
        this(null, message);
    }

    public InputInvalidException(String message, Object... params) {
        this(null, message, params);
    }

    public InputInvalidException(String data, String message, Object... params) {
        super(RestCodeEnum.InputInvalidException, StrUtil.format(message, params), data);
    }
}