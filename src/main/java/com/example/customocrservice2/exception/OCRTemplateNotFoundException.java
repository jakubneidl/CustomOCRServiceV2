package com.example.customocrservice2.exception;

import org.springframework.http.HttpStatus;

public class OCRTemplateNotFoundException extends CustomOCRServiceException {

    private static final HttpStatus httpStatus = HttpStatus.NOT_FOUND;

    public OCRTemplateNotFoundException(String message) {
        super(httpStatus, message);
    }
}
