package com.lindp.zmall.common.response;

import cn.hutool.core.util.StrUtil;
import com.lindp.zmall.common.utils.JsonUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Restful 返回对象
 *
 * @author lindp
 * @date 2020/9/24
 */
@Data
@Accessors(chain = true)
public class CommonResult<T> implements Serializable {
    @ApiModelProperty(value = "业务码")
    private String code;
    @ApiModelProperty(value = "业务描述")
    private String message;
    @ApiModelProperty(value = "业务数据")
    private T data;
    @ApiModelProperty(value = "业务自定义数据")
    private Object userData;

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>()
                .setData(data)
                .setCode(RestCodeEnum.OK.getCode());
    }

    public static <T> CommonResult<T> success(T data, Object userData) {
        return new CommonResult<T>()
                .setData(data)
                .setUserData(userData)
                .setCode(RestCodeEnum.OK.getCode());
    }

    public static <T> CommonResult<T> success(T data, String message, Object... params) {
        return new CommonResult<T>()
                .setCode(RestCodeEnum.OK.getCode())
                .setData(data)
                .setMessage(StrUtil.format(message, params));
    }

    public static <T> CommonResult<T> success(T data, Object userData, String message, Object... params) {
        return new CommonResult<T>()
                .setCode(RestCodeEnum.OK.getCode())
                .setData(data)
                .setUserData(userData)
                .setMessage(StrUtil.format(message, params));
    }

    public static <T> CommonResult<T> error(RestCodeEnum code) {
        return new CommonResult<T>()
                .setCode(code.getCode())
                .setMessage(code.getMessage());
    }

    public static <T> CommonResult<T> error(RestCodeEnum code, String message, Object... params) {
        return new CommonResult<T>()
                .setCode(code.getCode())
                .setMessage(StrUtil.format(message, params));
    }

    public static <T> CommonResult<T> error(RestCodeEnum code, T data, String message, Object... params) {
        return new CommonResult<T>()
                .setCode(code.getCode())
                .setData(data)
                .setMessage(StrUtil.format(message, params));
    }

    public static <T> CommonResult<T> error(RestCodeEnum code, T data, Object userData, String message, Object... params) {
        return new CommonResult<T>()
                .setCode(code.getCode())
                .setData(data)
                .setUserData(userData)
                .setMessage(StrUtil.format(message, params));
    }

    public static <T> CommonResult<T> error(String code, String message, Object... params) {
        return new CommonResult<T>()
                .setCode(code)
                .setMessage(StrUtil.format(message, params));
    }

    public String toJson() {
        return JsonUtil.obj2String(this);
    }
}
