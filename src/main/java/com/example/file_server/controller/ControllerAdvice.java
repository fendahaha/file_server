package com.example.file_server.controller;

import com.example.file_server.exception.AuthenticateException;
import com.example.file_server.utils.ResponseUtil;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.HashMap;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(ConstraintViolationException.class)
    public Object handleValidationExceptions(ConstraintViolationException ex) {
        ex.printStackTrace();
        StringBuilder errors = new StringBuilder();
        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
            errors.append(violation.getMessage()).append("\n");
        }
        return ResponseUtil.badRequest(errors);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        ex.printStackTrace();
        BindingResult bindingResult = ex.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        HashMap<String, Object> hashMap = new HashMap<>();
        fieldErrors.forEach(e -> {
            hashMap.put(e.getField(), e.getDefaultMessage());
        });
        return ResponseUtil.badRequest(hashMap);
    }

    /**
     * Validator校验普通实体失败抛出的异常
     */
//    @ExceptionHandler(BindException.class)
//    public Object bindException(BindException e) {
//        //LOGGER.info("全局异常捕获器-捕获到BindException：", e);
//        return ResponseUtil.badRequest("");
//    }

    /**
     * 请求方法不被允许异常
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Object httpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException ex) {
        ex.printStackTrace();
        return ResponseUtil.badRequest("HttpRequestMethodNotSupportedException");
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public Object httpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException ex) {
        ex.printStackTrace();
        return ResponseUtil.badRequest("HttpMediaTypeNotSupportedException");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public Object noHandlerFoundException(NoHandlerFoundException ex) {
        ex.printStackTrace();
        return ResponseUtil.badRequest("noHandlerFoundException");
    }

    @ExceptionHandler(AuthenticateException.class)
    public Object authenticateException(AuthenticateException ex) {
        return ResponseUtil.unauthorized("AuthenticateException");
    }

    /**
     * 总异常：只要出现异常，总会被这个拦截，因为所以的异常父类为：Exception
     */
    @ExceptionHandler(Exception.class)
    public Object exception(Exception ex) {
        ex.printStackTrace();
        //LOGGER.info("全局异常捕获器-捕获到Exception：", ex);
        return ResponseUtil.badRequest(ex.getMessage());
    }

}
