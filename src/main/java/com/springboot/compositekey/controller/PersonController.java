package com.springboot.compositekey.controller;

import com.springboot.compositekey.models.Person;
import com.springboot.compositekey.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;


    @PostMapping("/save-details")
    public void saveDetails(@RequestBody Person person){
        personService.saveDetails(person);
    }

    @PostMapping("/save-all-details")
    public void saveAllDetails(@RequestBody List<Person> personList){
        personService.saveAllDetails(personList);
    }
    @RequestMapping("/all-details")
    public List<Person> getAllDetails(){
        return personService.getAllDetails();
    }

}
