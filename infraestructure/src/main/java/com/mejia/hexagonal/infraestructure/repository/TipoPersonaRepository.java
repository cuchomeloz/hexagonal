package com.mejia.hexagonal.infraestructure.repository;

import com.mejia.hexagonal.infraestructure.entity.TipoPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity, Long> {
}
