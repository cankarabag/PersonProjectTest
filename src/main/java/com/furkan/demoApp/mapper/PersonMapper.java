package com.furkan.demoApp.mapper;

import com.furkan.demoApp.dto.PersonDTO;
import com.furkan.demoApp.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {


    public void fillEntity(PersonDTO dto, Person entity){
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
    }

    public void fillDTO(PersonDTO dto, Person entity){
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
    }
}
