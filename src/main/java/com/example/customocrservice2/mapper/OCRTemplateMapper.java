package com.example.customocrservice2.mapper;

import com.example.customocrservice2.domain.OCRTemplate;
import com.example.customocrservice2.model.OCRTemplateRequestDTO;
import com.example.customocrservice2.model.OCRTemplateResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class OCRTemplateMapper {

    public abstract OCRTemplate mapToDomain(OCRTemplateRequestDTO ocrTemplateRequestDTO);

    public abstract OCRTemplateResponseDTO mapToDto(OCRTemplate ocrTemplate);

}
