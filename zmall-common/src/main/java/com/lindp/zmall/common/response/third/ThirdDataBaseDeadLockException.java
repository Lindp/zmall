package com.lindp.zmall.common.response.third;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* 数据库死锁
*
* @author lindp
* @date 2020/9/24
*/
public class ThirdDataBaseDeadLockException extends CommonException {

    public ThirdDataBaseDeadLockException() {
        this(null, RestCodeEnum.ThirdDataBaseDeadLockException.getMessage());
    }

    public ThirdDataBaseDeadLockException(String message) {
        this(null, message);
    }

    public ThirdDataBaseDeadLockException(String message, Object... params) {
        this(null, message, params);
    }

    public ThirdDataBaseDeadLockException(String data, String message, Object... params) {
        super(RestCodeEnum.ThirdDataBaseDeadLockException, StrUtil.format(message, params), data);
    }
}