package com.company;
import java.util.List;

public abstract class Person {

    private String firstName;
    private String lastName;

    /**
     * Instantiates a new Person.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String
     * return String with first and second name
     */
    @Override
    public String toString() {
        return "Person : " + firstName + ", " + lastName ;
    }
}