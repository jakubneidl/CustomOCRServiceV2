package com.example.customocrservice2.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public abstract class AbstractEntity {

    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
