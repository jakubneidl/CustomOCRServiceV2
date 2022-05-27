package com.example.customocrservice2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "OCRTemplates")
public class OCRTemplate extends AbstractEntity {

    @Indexed(unique = true)
    private String name;
    private List<ScannedField> scannedFields;
}
