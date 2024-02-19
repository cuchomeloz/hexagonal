package com.mejia.hexagonal.domain.ports.in;

import com.mejia.hexagonal.domain.aggregates.response.ResponseReniec;

public interface ReniecServiceIn {
    ResponseReniec getInfoIn(String numero);

}
