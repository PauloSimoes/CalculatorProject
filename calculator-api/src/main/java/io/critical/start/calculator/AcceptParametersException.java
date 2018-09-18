package io.critical.start.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.ACCEPTED)
public class AcceptParametersException extends RuntimeException {

  public AcceptParametersException(String exception) {
    super(exception);
  }

}