package com.example.ptiringo.web;

import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND) // 404
    @ExceptionHandler(NoHandlerFoundException.class)
    public ApiError handleNotFound() {
        return new ApiError("Resource not found.", "101");
    }

    @Value
    public static class ApiError {
        private String message;
        private String code;
    }

}
