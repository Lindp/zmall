package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 包含违禁敏感词
*
* @author lindp
* @date 2020/9/24
*/
public class InputSensitiveWordsException extends CommonException {

    public InputSensitiveWordsException() {
        this(null, RestCodeEnum.InputSensitiveWordsException.getMessage());
    }

    public InputSensitiveWordsException(String message) {
        this(null, message);
    }

    public InputSensitiveWordsException(String message, Object... params) {
        this(null, message, params);
    }

    public InputSensitiveWordsException(String data, String message, Object... params) {
        super(RestCodeEnum.InputSensitiveWordsException, StrUtil.format(message, params), data);
    }
}