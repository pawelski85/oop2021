package com.company;

import com.company.devices.FoodType;

public class Pet extends Animal{
    final static Double DEFAULT_PET_WEIGHT = 1.0;

    public Pet(String species, FoodType foodType) {
        super(species, foodType);
    }
}
