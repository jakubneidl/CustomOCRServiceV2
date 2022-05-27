package com.example.customocrservice2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class OCRBulkDocument extends AbstractEntity {

    private List<OCRDocument> ocrDocuments;
}
