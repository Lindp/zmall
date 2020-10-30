package com.lindp.zmall.common.response.user;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.CommonException;
import com.lindp.zmall.common.response.RestCodeEnum;

/**
* 地域黑名单
*
* @author lindp
* @date 2020/9/24
*/
public class RegionBlacklistException extends CommonException {

    public RegionBlacklistException() {
        this(null, RestCodeEnum.RegionBlacklistException.getMessage());
    }

    public RegionBlacklistException(String message) {
        this(null, message);
    }

    public RegionBlacklistException(String message, Object... params) {
        this(null, message, params);
    }

    public RegionBlacklistException(String data, String message, Object... params) {
        super(RestCodeEnum.RegionBlacklistException, StrUtil.format(message, params), data);
    }
}