package com.mejia.hexagonal.domain.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestPersona {
    private String tipoDoc;
    private String numDoc;
}
