package com.example.customocrservice2.api.v1;

import com.example.customocrservice2.model.OCRTemplateRequestDTO;
import com.example.customocrservice2.model.OCRTemplateResponseDTO;
import com.example.customocrservice2.service.OCRTemplateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class OCRTemplateController {

    private final OCRTemplateServiceImpl ocrTemplateService;

    @PostMapping("/templates")
    public Mono<String> saveTemplate(@RequestBody OCRTemplateRequestDTO ocrTemplateRequestDTO) {
        return ocrTemplateService.saveOCRTemplate(ocrTemplateRequestDTO);
    }

    @PutMapping("/templates/{name}")
    public Mono<String> updateTemplate(@RequestBody OCRTemplateRequestDTO ocrTemplateRequestDTO) {
        return ocrTemplateService.updateOCRTemplate(ocrTemplateRequestDTO);
    }

    @GetMapping("/templates")
    public Flux<OCRTemplateResponseDTO> findAll() {
        return ocrTemplateService.findAll();
    }

    @GetMapping("/templates/{name}")
    public Flux<OCRTemplateResponseDTO> ocrTemplateResponseDTO(@PathVariable("name") String name) {
        return ocrTemplateService.findByTemplateName(name);

//        ScannerFieldResponseDTO scannerFieldResponseDTO = new ScannerFieldResponseDTO();
//        scannerFieldResponseDTO.setFieldName("ICO");
//        OCRTemplateResponseDTO ocrTemplateResponseDTO = new OCRTemplateResponseDTO();
//        ocrTemplateResponseDTO.setName("FAKTUROID");
//        ocrTemplateResponseDTO.setScannerFields(List.of(scannerFieldResponseDTO));
//        return Mono.just(ocrTemplateResponseDTO);
    }

    @DeleteMapping("/templates")
    public void deleteAllTemplates() {
        ocrTemplateService.deleteAll();
    }
}
