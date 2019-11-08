package com.springboot.compositekey.repository;


import com.springboot.compositekey.models.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getAll() {

        return entityManager.createQuery("SELECT E FROM Person E", Person.class).getResultList();

    }

    public void save(Person person) {
        entityManager.persist(person);
    }
    public void saveAll(List<Person> personList){
        for (Person person:personList){
            entityManager.persist(person);
        }
    }
}
