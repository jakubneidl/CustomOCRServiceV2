package com.example.customocrservice2.model;

import lombok.Data;

import java.util.List;

@Data
public class OCRTemplateRequestDTO {

    private String name;
    private List<ScannerFieldRequestDTO> scannerFields;
}
