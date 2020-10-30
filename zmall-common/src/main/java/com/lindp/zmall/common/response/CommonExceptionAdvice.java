package com.lindp.zmall.common.response;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * Restful 统一异常处理
 *
 * @author lindp
 * @date 2020/9/24
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.haitao")
public class CommonExceptionAdvice {

    /**
     * 捕获自定义异常
     *
     * @param e
     * @param response
     * @return
     */
    @ExceptionHandler(CommonException.class)
    public CommonResult<?> restfulExceptionHandler(CommonException e, HttpServletResponse response) {
        response.setStatus(e.getHttpStatusCode());
        if (StrUtil.isNotBlank(e.getData())) {
            log.error("rest exception error data : {}", e.getData());
        }
        log.error(e.getMessage(), e);
        return CommonResult.error(e.getCode(), e.getMessage());
    }

    /**
     * 捕获非自定义异常
     *
     * @param e
     * @param response
     * @return
     */
    @ExceptionHandler(Exception.class)
    public CommonResult<?> exceptionHandler(Exception e, HttpServletResponse response) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        log.error(e.getMessage(), e);
        return CommonResult.error(RestCodeEnum.SystemExecuteException, e.getMessage());
    }
}
