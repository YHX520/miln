package com.zixuan.milnweb.handle;

import exception.BaseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import resultutils.Result;
import resultutils.ResultUtils;


@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Result handler(BaseException e) {
        return ResultUtils.Fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handler(Exception e) {
        return ResultUtils.Fail(500, e.getMessage());
    }
}
