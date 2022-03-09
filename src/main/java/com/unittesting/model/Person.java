package com.unittesting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private int personId;

    private String personName;

    private String personCity;

    public Person() {
    }

    public Person(int personId, String personName, String personCity) {
        this.personId = personId;
        this.personName = personName;
        this.personCity = personCity;
    }

    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }
}
