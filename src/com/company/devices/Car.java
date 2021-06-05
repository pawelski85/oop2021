package com.company.devices;

public class Car extends Device implements Refillable, Comparable<Car> {

    public Double engineSize;
    public String fuelType;

    public Car(String producer, String model) {
        super(producer, model);
    }

    @Override
    public void turnOn() {
        System.out.println("turning the key");
        System.out.println("engine starts");
        System.out.println("you can drive now");
    }

    @Override
    public void refill() {
        System.out.println("go to gas awefaw");
        System.out.println("fill the tank with gas");
        System.out.println("PAY!");
    }


    @Override
    public void refillToFull() {

    }

    @Override
    public int compareTo(Car car) {
        return (int) (this.engineSize - car.engineSize);
    }
}
