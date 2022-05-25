package com.company;

import com.company.devices.FoodType;

public class FarmAnimal extends Animal{
    final static Double DEFAULT_FARM_ANIMAL_WEIGHT = 40.0;


    public FarmAnimal(String species, FoodType foodType) {
        super(species, foodType);
    }
}
