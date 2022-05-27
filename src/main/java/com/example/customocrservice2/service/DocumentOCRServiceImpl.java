package com.example.customocrservice2.service;

import com.example.customocrservice2.components.OCRFieldScanner;
import com.example.customocrservice2.domain.OCRDocument;
import com.example.customocrservice2.domain.ScannedField;
import com.example.customocrservice2.model.OCRDocumentResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class DocumentOCRServiceImpl {

    private final OCRFieldScanner ocrFieldScanner;

    public Mono<OCRDocumentResponseDTO> scanDocument(Mono<OCRDocument> ocrDocumentMono) {
        Flux<ScannedField> scannedFieldFlux = ocrFieldScanner.scanDocument(ocrDocumentMono);
    }


}
