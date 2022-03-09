package com.unittesting.service;

import com.unittesting.dao.PersonRepository;
import com.unittesting.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Person> findAllPerson() {

        return this.repository.findAll();
    }

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }
}
