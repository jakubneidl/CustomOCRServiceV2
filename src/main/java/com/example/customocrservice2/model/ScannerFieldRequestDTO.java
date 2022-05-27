package com.example.customocrservice2.model;


import lombok.Data;

@Data
public class ScannerFieldRequestDTO {

    private String fieldName;

    private int x;
    private int y;
    private int width;
    private int height;
}
