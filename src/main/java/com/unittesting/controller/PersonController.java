package com.unittesting.controller;

import com.unittesting.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/person")
    public ResponseEntity<?> findAllPerson() {

        return ResponseEntity.ok(this.service.findAllPerson());
    }

}
