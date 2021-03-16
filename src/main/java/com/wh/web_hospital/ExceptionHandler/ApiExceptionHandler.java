package com.wh.web_hospital.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler{

@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
        HttpHeaders headers, HttpStatus status, WebRequest request) {
        
        var fields = new ArrayList<Exception.Field>();

            for(ObjectError error : ex.getBindingResult().getAllErrors()){
                String name = error.getObjectName();
                String message = error.getDefaultMessage();
                fields.add(new Exception.Field(name,message));
            }

        var exception  = new Exception();
        exception.setStatus(status.value());
        exception.setTitle("Invalid fields! Fill them correctly and try again.");
        exception.setDateAndTime(LocalDateTime.now());
        exception.setFields(fields);

    return super.handleExceptionInternal(ex, exception, headers, status, request);
}

}