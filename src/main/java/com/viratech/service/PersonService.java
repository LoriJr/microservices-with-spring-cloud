package com.viratech.service;

import com.viratech.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;
    private final Logger log = LoggerFactory.getLogger(PersonService.class.getSimpleName());

    
}
