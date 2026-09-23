package com.viratech.mapper;

import com.viratech.dto.PersonRequest;
import com.viratech.dto.PersonResponse;
import com.viratech.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonResponse toDto(Person entity){
        return new PersonResponse(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getAddress(),
                entity.getGender()
        );
    }

    public Person toEntity(PersonRequest request){
        return Person.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .address(request.address())
                .gender(request.gender())
                .build();
    }
}
