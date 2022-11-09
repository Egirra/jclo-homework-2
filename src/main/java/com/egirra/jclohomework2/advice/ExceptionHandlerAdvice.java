package com.egirra.jclohomework2.advice;

import com.egirra.jclohomework2.exception.InvalidCredentials;
import com.egirra.jclohomework2.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> icHandler(InvalidCredentials ex) {
        return new ResponseEntity<>("Exception invalid credentials", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> uuHandler(UnauthorizedUser ex) {
        return new ResponseEntity<>("Exception unauthorized user", HttpStatus.UNAUTHORIZED);
    }
}
