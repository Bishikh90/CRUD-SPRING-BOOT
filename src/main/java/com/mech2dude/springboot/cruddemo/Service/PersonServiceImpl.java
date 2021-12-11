package com.mech2dude.springboot.cruddemo.Service;

import com.mech2dude.springboot.cruddemo.Domain.Person;
import com.mech2dude.springboot.cruddemo.Repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void addPerson(Person person) {
        person.setId(getRandomNumber(1,99999));
        personRepository.save(person);
    }

    @Override
    public List<Person> getAllPatients() {
        List<Person> peopleList = personRepository.findAll();
        return peopleList;
    }

    @Override
    public Person getPersonById(int id) {
        return personRepository.getById(id);
    }

    @Override
    public void updatePersonCovidInfo(int id) {
        personRepository.setCovidInfo("Negative",id);

    }

    @Override
    public void deletePersonById(int id) {
        personRepository.deleteById(id);
    }

    private int getRandomNumber(int min, int max) {
        return (int)((Math.random()*(max-min)) + min);
    }
}
