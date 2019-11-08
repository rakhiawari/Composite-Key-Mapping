package com.springboot.compositekey.models;

import org.springframework.stereotype.Component;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Person {

    @EmbeddedId
    private EmbeddedKey embeddedKey;
    private Double salary;

    public Person(){}
    public Person(EmbeddedKey embeddedKey, Double salary) {
        this.embeddedKey = embeddedKey;
        this.salary = salary;
    }

    public EmbeddedKey getEmbeddedKey() {
        return embeddedKey;
    }

    public void setEmbeddedKey(EmbeddedKey embeddedKey) {
        this.embeddedKey = embeddedKey;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return embeddedKey.equals(person.embeddedKey) &&
                salary.equals(person.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(embeddedKey, salary);
    }
}
