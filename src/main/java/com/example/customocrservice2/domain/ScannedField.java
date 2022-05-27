package com.example.customocrservice2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class ScannedField extends AbstractEntity {

    private String fieldName;
    private Rectangle textLocation;
}
