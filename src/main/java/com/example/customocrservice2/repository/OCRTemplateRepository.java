package com.example.customocrservice2.repository;

import com.example.customocrservice2.domain.OCRTemplate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface OCRTemplateRepository extends ReactiveMongoRepository<OCRTemplate, UUID> {
    Mono<OCRTemplate> findByName(String name);
}
