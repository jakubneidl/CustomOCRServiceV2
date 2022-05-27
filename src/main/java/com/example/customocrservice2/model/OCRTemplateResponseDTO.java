package com.example.customocrservice2.model;

import lombok.Data;

import java.util.List;

@Data
public class OCRTemplateResponseDTO {

    private String name;
    private List<ScannerFieldResponseDTO> scannerFields;
}
