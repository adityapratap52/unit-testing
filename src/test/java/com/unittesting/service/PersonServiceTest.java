package com.unittesting.service;

import com.unittesting.dao.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    private PersonRepository repository;

     private PersonService personService;

    @BeforeEach
    void setUp() {
        this.personService = new PersonService(this.repository);
    }

    @Test
    void findAllPerson() {

        personService.findAllPerson();
        verify(repository).findAll();

    }
}