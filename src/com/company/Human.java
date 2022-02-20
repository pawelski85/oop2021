package com.company;

import com.company.devices.FoodType;
import com.company.devices.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;

    public final static String HUMAN_SPECIE = "homo sapiens";

    private Double salary;

    public Human(String species, FoodType foodType, String firstName, String lastName, Animal pet, Phone phone, Double salary) {
        super(species, foodType);
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.phone = phone;
        this.salary = salary;
    }

    public Double getSalary() {
        //check the access rights of the user
        //log some information
        //check if we have a value in cache
        //if not read it from database
        return this.salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("NOBODY WILL PAY FOR WORKING");
            this.salary = 0.0;
        }
    }

}
