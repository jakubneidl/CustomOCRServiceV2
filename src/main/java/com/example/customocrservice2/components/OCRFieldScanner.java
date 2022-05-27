package com.example.customocrservice2.components;

import com.example.customocrservice2.domain.OCRDocument;
import com.example.customocrservice2.domain.ScannedField;
import lombok.RequiredArgsConstructor;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.awt.*;
import java.io.File;

@Component
@RequiredArgsConstructor
public class OCRFieldScanner {

    private final Tesseract tesseract;

    public Flux<ScannedField> scanDocument(Mono<OCRDocument> ocrDocument) {
        OCRDocument ocrBlock = ocrDocument.block();
        return ocrDocument
                .map(ocrDocument1 -> ocrDocument1.getOcrTemplate().getScannedFields())
                .flatMapMany(Flux::fromIterable)
                .parallel()
                .runOn(Schedulers.parallel())
                .doOnNext(scannedField -> {
                    assert ocrBlock != null;
                    scannedField.setValue(scanField(scannedField, ocrBlock.getFilePath()));
                }).sequential();
    }

    private String scanField(ScannedField scannedField, String documentPath) {

        File file = new File(documentPath);
        Rectangle fieldLocation = new Rectangle(scannedField.getX(), scannedField.getY(), scannedField.getWidth(), scannedField.getHeight());

        try {
            return tesseract.doOCR(file, fieldLocation);
        } catch (TesseractException e) {
            e.printStackTrace();
        }

        return "scanning failed";
    }


}
