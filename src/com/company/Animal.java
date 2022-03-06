package com.company;

import com.company.devices.FoodType;

public class Animal {

    final static Double DEFAULT_DOG_WEIGHT = 6.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    public String name;
    final static Double DEFAULT_CAT_WEIGHT = 1.0;
    final static Double DEFAULT_ELEPHANT_WEIGHT = 2000.0;
    final static Double DEFAULT_WEIGHT = 0.5;
    public final String species;
    private Double weight;
    public FoodType foodType;

    public Double getWeight() {
        return weight;
    }

    public Animal(String species, FoodType foodType) {
        this.species = species;
        this.foodType = foodType;

        switch (species) {
            case "dog" -> {
                this.weight = DEFAULT_DOG_WEIGHT;
       //         this.foodType = FoodType.ALL;
            }
            case "cat" -> {
                this.weight = DEFAULT_CAT_WEIGHT;
      //          this.foodType = FoodType.ALL;
            }
            case "cow" -> {
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
      //          this.foodType = FoodType.CROPS;
            }
            case "homo sapiens" -> {
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
      //          this.foodType = FoodType.CROPS;
            }
            default -> {
                this.weight = DEFAULT_WEIGHT;
      //          this.foodType = FoodType.MEET;
            }
        }

    }

    void printWeight() {
        System.out.println(weight);
    }

    void feed(Double foodWeight, FoodType foodType) {
        if(this.foodType == foodType){
            this.weight += (foodWeight * foodType.ratio);
            System.out.println("thx for food");
        } else{
            System.out.println("I don't like it :/");
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", foodType=" + foodType +
                '}';
    }

    //    void feed(Double foodWeight) {
//        this.weight += foodWeight;
//        System.out.println("thx for food, bro");
//        System.out.println("my weight is now " + this.weight);
//        switch (this.foodType) {
//            case MEET -> this.weight += (foodWeight / 2);
//            case CROPS -> this.weight += (70 * (foodWeight / 100));
//            case ALL -> this.weight += (30 * (foodWeight / 100));
//        }
//        System.out.println("thx for food, bro");
//        System.out.println("my weight is now " + this.weight);
//    }

//    public void setWeight(Double weight) {
//        this.weight = weight;
//    }
//
//    String returnSpeciesAndName() {
//        return species + " " + name;
//    }
//
//    String returnNameAndOwner(String owner) {
//        return name + " " + owner;
//    }
//
//    public void sell(Human seller, Human buyer, Double price) {
//        System.out.println(this.name);
//        if (seller.pet == this) {
//            seller.pet = null;
//            buyer.pet = this;
//        }

}
