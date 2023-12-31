package com.poketroll.users.domain.exceptions;

public class AlreadyExistsException extends RuntimeException {

  public AlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public AlreadyExistsException(String message) {
    super(message);
  }
}
