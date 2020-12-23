package com.gproject.handler;

import com.gproject.vo.Result;
import com.gproject.vo.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 全局异常处理,没有指定异常的类型,不管什么异常都是可以捕获的
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        log.error(e.getMessage());
        return Result.error();
    }

    /**
     * 处理特定异常类型,可以定义多个
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        log.error(e.getMessage());
        return Result.error().code(ResultCode.ARITHMETIC_EXCEPTION.getCode())
                .message(ResultCode.ARITHMETIC_EXCEPTION.getMsg());
    }

    /**
     * 处理业务异常,我们自己定义的异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result error(BusinessException e){
        e.printStackTrace();
        log.error(e.getErrMsg());
        return Result.error().code(e.getCode())
                .message(e.getErrMsg());
    }
}
