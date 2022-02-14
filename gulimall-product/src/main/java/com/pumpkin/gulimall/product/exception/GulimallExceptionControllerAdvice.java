package com.pumpkin.gulimall.product.exception;

import com.pumpkin.common.exception.BizCodeEnum;
import com.pumpkin.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @author pumpkin
 * @date 2022/2/14 0014 下午 22:52
 */
@RestControllerAdvice(basePackages = "com.pumpkin.gulimall.product.controller")
@Slf4j
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R HandlerVliadArgs(MethodArgumentNotValidException e){
        BindingResult result = e.getBindingResult();
        HashMap<String, String> map = new HashMap<>();
        result.getFieldErrors().forEach(item->{
            String message = item.getDefaultMessage();
            String field = item.getField();
            map.put(field ,message) ;
        });
        return R.error(BizCodeEnum.VALID_MATHOD.getCode() , BizCodeEnum.VALID_MATHOD.getMessage()).put("data",map) ;
    }

    @ExceptionHandler(value = Exception.class)
    public R HandlerException(Exception e ){
        return  R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMessage()) ;
    }
}
