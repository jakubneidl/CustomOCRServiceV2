package com.example.customocrservice2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class OCRTemplate extends AbstractEntity {

    private String name;
    private List<ScannedField> scannedFields;
}
