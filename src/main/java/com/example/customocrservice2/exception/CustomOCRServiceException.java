package com.example.customocrservice2.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
public class CustomOCRServiceException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;

}
