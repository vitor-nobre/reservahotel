package com.br.reservahotel.quarto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class QuartoNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(QuartoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String hotelNotFoundHandler(QuartoNotFoundException ex) {
        return ex.getMessage();
    }
}
