package com.springboot.compositekey.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmbeddedKey implements Serializable {

    private String firstName;
    private String lastName;
    private String street;

    public EmbeddedKey(){}

    public EmbeddedKey(String firstName, String lastName, String street) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmbeddedKey)) return false;
        EmbeddedKey that = (EmbeddedKey) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(street, that.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, street);
    }
}
