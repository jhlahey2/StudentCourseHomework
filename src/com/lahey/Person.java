package com.lahey;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String idNumber;

    public Person() {
    }

    /**
     * gets first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get email address
     * @return email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * set email adcress
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get ID number
     * @return ID number
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * set ID number
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
