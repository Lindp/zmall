package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 通知服务出错
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdNoticeServiceException extends CommonException {

    public ThirdNoticeServiceException() {
        this(null, RestCodeEnum.ThirdNoticeServiceException.getMessage());
    }

    public ThirdNoticeServiceException(String message) {
        this(null, message);
    }

    public ThirdNoticeServiceException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdNoticeServiceException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdNoticeServiceException, StrUtil.format(message, params), data);
    }
}