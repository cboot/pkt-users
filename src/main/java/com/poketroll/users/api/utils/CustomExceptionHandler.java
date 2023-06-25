package com.poketroll.users.api.utils;

import com.poketroll.users.domain.exceptions.AlreadyExistsException;
import com.poketroll.users.domain.exceptions.NotFoundException;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

  @Data
  @Builder
  private static class Error {
    private String message;
    private int status;
  }

  @ExceptionHandler(AlreadyExistsException.class)
  public ResponseEntity<Error> handleAlreadyExists(AlreadyExistsException ex) {
    return ResponseEntity.status(HttpStatus.CONFLICT)
        .body(Error.builder().message(ex.getMessage()).status(HttpStatus.CONFLICT.value()).build());
  }

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<Error> handleAlreadyExists(NotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(
            Error.builder().message(ex.getMessage()).status(HttpStatus.NOT_FOUND.value()).build());
  }
}
