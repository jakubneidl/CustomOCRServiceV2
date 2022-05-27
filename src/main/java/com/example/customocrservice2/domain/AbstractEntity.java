package com.example.customocrservice2.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
public abstract class AbstractEntity {

    private String id;
    @CreatedDate
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
