package com.example.customocrservice2.api.v1;

import com.example.customocrservice2.model.OCRTemplateRequestDTO;
import com.example.customocrservice2.model.OCRTemplateResponseDTO;
import com.example.customocrservice2.service.OCRTemplateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class OCRController {

    private final OCRTemplateServiceImpl ocrTemplateService;

    @PostMapping("/templates")
    public void saveTemplate(@RequestBody OCRTemplateRequestDTO ocrTemplateRequestDTO) {
        ocrTemplateService.saveOCRTemplate(ocrTemplateRequestDTO);
    }

    @GetMapping("/templates/{name}")
    public Mono<OCRTemplateResponseDTO> ocrTemplateResponseDTO(@PathVariable("name") String name) {
        return ocrTemplateService.findByTemplateName(name);
    }

}
