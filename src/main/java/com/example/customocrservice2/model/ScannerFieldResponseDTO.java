package com.example.customocrservice2.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScannerFieldResponseDTO {

    private String fieldName;
    private int x;
    private int y;
    private int width;
    private int height;
}
