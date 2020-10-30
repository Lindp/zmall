package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 包含非法恶意跳转链接
*
* @author lindp
* @date 2020/9/24
*/
public class LinkIllegalSpiteException extends CommonException {

    public LinkIllegalSpiteException() {
        this(null, RestCodeEnum.LinkIllegalSpiteException.getMessage());
    }

    public LinkIllegalSpiteException(String message) {
        this(null, message);
    }

    public LinkIllegalSpiteException(String message, Object... params) {
        this(null, message, params);
    }

    public LinkIllegalSpiteException(String data, String message, Object... params) {
        super(RestCodeEnum.LinkIllegalSpiteException, StrUtil.format(message, params), data);
    }
}