package com.mejia.hexagonal.infraestructure.repository;

import com.mejia.hexagonal.infraestructure.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}
