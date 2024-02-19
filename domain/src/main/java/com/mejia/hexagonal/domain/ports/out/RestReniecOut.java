package com.mejia.hexagonal.domain.ports.out;

import com.mejia.hexagonal.domain.aggregates.response.ResponseReniec;

public interface RestReniecOut {
    ResponseReniec getInfoReniec(String numDoc);

}
