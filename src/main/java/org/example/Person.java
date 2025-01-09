package org.example;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private String email;
    private LocalDate birthDate;
    private String address;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String email, String address, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }

}
