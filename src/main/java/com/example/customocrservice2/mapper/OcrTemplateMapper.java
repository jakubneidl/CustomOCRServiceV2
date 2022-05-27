package com.example.customocrservice2.mapper;

import com.example.customocrservice2.domain.OCRTemplate;
import com.example.customocrservice2.model.OCRTemplateRequestDTO;
import com.example.customocrservice2.model.OCRTemplateResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OcrTemplateMapper {

    OCRTemplate mapToDomain(OCRTemplateRequestDTO ocrTemplateRequestDTO);

    OCRTemplateResponseDTO mapToDto(OCRTemplate ocrTemplate);
}
