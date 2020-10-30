package com.haitao.common.restresponse.${modelName};

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.response.RestCodeEnum;
import com.lindp.zmall.common.response.CommonException;

/**
* ${comment}
*
* @author lindp
* @date 2020/9/24
*/
public class ${javaName} extends RestfulException {

    public ${javaName}() {
        this(null, RestfulCodeEnum.${javaName}.getMessage());
    }

    public ${javaName}(String message) {
        this(null, message);
    }

    public ${javaName}(String message, Object... params) {
        this(null, message, params);
    }

    public ${javaName}(String data, String message, Object... params) {
        super(RestfulCodeEnum.${javaName}, StrUtil.format(message, params), data);
    }
}