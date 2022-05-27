package com.example.customocrservice2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ScannedField extends AbstractEntity {

    private String fieldName;
    private int x;
    private int y;
    private int width;
    private int height;
}
