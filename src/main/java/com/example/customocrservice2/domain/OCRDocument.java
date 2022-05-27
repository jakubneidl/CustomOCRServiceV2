package com.example.customocrservice2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class OCRDocument extends AbstractEntity {

    private String filePath;
    private OCRTemplate ocrTemplate;
}
