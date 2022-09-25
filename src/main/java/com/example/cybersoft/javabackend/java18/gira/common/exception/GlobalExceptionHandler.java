package com.example.cybersoft.javabackend.java18.gira.common.exception;

import com.example.cybersoft.javabackend.java18.gira.common.model.ResponseDTO;
import com.example.cybersoft.javabackend.java18.gira.common.util.ResponseUtils;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ResponseDTO> handleConstraintViolationException(
            ConstraintViolationException exception
    ){
        return ResponseUtils.error(exception, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exception
    ){
        return ResponseUtils.error(exception, HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(RuntimeException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<ResponseDTO> handleGlobalException(
//            RuntimeException exception
//    ){
//        return ResponseUtils.error(exception, HttpStatus.BAD_REQUEST);
//    }
}
