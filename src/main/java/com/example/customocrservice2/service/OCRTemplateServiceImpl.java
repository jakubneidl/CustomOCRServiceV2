package com.example.customocrservice2.service;

import com.example.customocrservice2.mapper.OcrTemplateMapper;
import com.example.customocrservice2.model.OCRTemplateRequestDTO;
import com.example.customocrservice2.model.OCRTemplateResponseDTO;
import com.example.customocrservice2.repository.OCRTemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OCRTemplateServiceImpl {

    private final OCRTemplateRepository ocrTemplateRepository;
    private final OcrTemplateMapper ocrTemplateMapper;

    public void saveOCRTemplate(OCRTemplateRequestDTO ocrTemplateRequestDTO) {
        ocrTemplateRepository.save(ocrTemplateMapper.mapToDomain(ocrTemplateRequestDTO));
    }

    public Mono<OCRTemplateResponseDTO> findByTemplateName(String name) {
        return ocrTemplateRepository.findByName(name)
                .map(ocrTemplateMapper::mapToDto);
    }
}
