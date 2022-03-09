package com.unittesting.dao;

import com.unittesting.model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    void isPersonExistsById() {

        Person person = new Person(123,"Aditya","Agra");
        personRepository.save(person);

        Boolean actualResult = personRepository.isPersonExistsById(123);

        assertThat(actualResult).isTrue();

    }

    @AfterEach
    void tearDown() {

        System.out.println("tearing down...");
        personRepository.deleteAll();

    }

    @BeforeEach
    void setUp() {
        System.out.println("tearing up...");
    }
}