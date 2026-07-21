package com.example.demo.controlleradvices;

import com.example.demo.exceptions.EmployeeNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler
    public String handleEmployeeNotFoundException(EmployeeNotFoundException e){
        return e.getMessage();
    }
}
