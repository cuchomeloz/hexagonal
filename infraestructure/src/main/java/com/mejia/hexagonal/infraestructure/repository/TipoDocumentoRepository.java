package com.mejia.hexagonal.infraestructure.repository;

import com.mejia.hexagonal.infraestructure.entity.TipoDocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Long> {
}
