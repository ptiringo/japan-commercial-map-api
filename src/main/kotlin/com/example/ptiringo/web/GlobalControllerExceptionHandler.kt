package com.example.ptiringo.web

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.servlet.NoHandlerFoundException

@ControllerAdvice
class GlobalControllerExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND) // 404
    @ExceptionHandler(NoHandlerFoundException::class)
    fun handleNotFound(): ApiError = ApiError("Resource not found.", "101")

    data class ApiError(val message: String, val code: String){
        constructor() : this("", "")
    }
}
