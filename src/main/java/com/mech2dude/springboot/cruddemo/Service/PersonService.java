package com.mech2dude.springboot.cruddemo.Service;

import com.mech2dude.springboot.cruddemo.Domain.Person;

import java.util.List;

public interface PersonService {

    void addPerson(Person person);
    List<Person> getAllPatients();
    Person getPersonById(int id);
    void updatePersonCovidInfo(int id);
    void deletePersonById(int id);
}
