package com.example.customocrservice2.config;

import net.sourceforge.tess4j.Tesseract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TesseractConfig {

    private static String TESSERACT_TRAINED_DATA_PATH = "src/main/resources/tessdata";

    @Bean
    public Tesseract tesseract() {
        Tesseract tesseract = new Tesseract();
        tesseract.setLanguage("eng");
        tesseract.setDatapath(TESSERACT_TRAINED_DATA_PATH);
        return tesseract;
    }

}
