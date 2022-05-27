package com.example.customocrservice2.service;

import com.example.customocrservice2.mapper.OCRTemplateMapper;
import com.example.customocrservice2.model.OCRTemplateRequestDTO;
import com.example.customocrservice2.model.OCRTemplateResponseDTO;
import com.example.customocrservice2.repository.OCRTemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OCRTemplateServiceImpl {

    private final OCRTemplateRepository ocrTemplateRepository;
    private final OCRTemplateMapper ocrTemplateMapper;


    public Mono<String> saveOCRTemplate(OCRTemplateRequestDTO ocrTemplateRequestDTO) {
        return ocrTemplateRepository.save(ocrTemplateMapper.mapToDomain(ocrTemplateRequestDTO))
                .map(ocrTemplate -> "Saved: " + ocrTemplate.getName() + " template");
    }

    public Mono<String> updateOCRTemplate(OCRTemplateRequestDTO ocrTemplateRequestDTO) {
        return ocrTemplateRepository.save(ocrTemplateMapper.mapToDomain(ocrTemplateRequestDTO))
                .map(ocrTemplate -> "Updated: " + ocrTemplate.getName() + " template");
    }

    public Flux<OCRTemplateResponseDTO> findAll() {
        return ocrTemplateRepository.findAll().map(ocrTemplateMapper::mapToDto);
    }

    public Flux<OCRTemplateResponseDTO> findByTemplateName(String name) {
        return ocrTemplateRepository.findByName(name)
                .map(ocrTemplateMapper::mapToDto);
    }

    public void deleteAll() {
        ocrTemplateRepository.deleteAll().subscribe();
    }
}
