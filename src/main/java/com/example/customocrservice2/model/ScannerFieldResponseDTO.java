package com.example.customocrservice2.model;

import lombok.Data;

import java.awt.*;

@Data
public class ScannerFieldResponseDTO {

    private String fieldName;
    private Rectangle textLocation;
}
