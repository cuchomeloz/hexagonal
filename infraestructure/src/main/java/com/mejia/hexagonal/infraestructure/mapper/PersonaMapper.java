package com.mejia.hexagonal.infraestructure.mapper;

import com.mejia.hexagonal.domain.aggregates.dto.PersonaDTO;
import com.mejia.hexagonal.infraestructure.entity.PersonaEntity;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class PersonaMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public PersonaDTO mapToDto(PersonaEntity entity){
        return modelMapper.map(entity, PersonaDTO.class);
    }
    public PersonaEntity mapToEntity(PersonaDTO personaDTO){
        return modelMapper.map(personaDTO, PersonaEntity.class);
    }
}