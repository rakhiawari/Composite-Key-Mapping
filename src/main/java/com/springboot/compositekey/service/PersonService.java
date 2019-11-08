package com.springboot.compositekey.service;


import com.springboot.compositekey.models.EmbeddedKey;
import com.springboot.compositekey.models.Person;
import com.springboot.compositekey.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {

    @Autowired
    PersonRepository personRepository;


    public List<Person> getAllDetails() {
        return personRepository.getAll();
    }


    public void saveDetails(Person person) {
        personRepository.save(person);
    }
    public void saveAllDetails(List<Person> personList){
        personRepository.saveAll(personList);
    }
}
