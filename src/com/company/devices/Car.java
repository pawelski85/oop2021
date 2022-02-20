package com.company.devices;

import java.util.Objects;

public class Car extends Device implements Refillable, Comparable<Car> {

    public Double engineSize;
    public String fuelType;
    public Engine engine;
    public boolean isRunning;

    public Car(String producer, String model) {
        super(producer, model);
        this.engine = new Engine();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return engineSize.equals(car.engineSize) && fuelType.equals(car.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineSize, fuelType);
    }

    public class Engine {
        private int horsePower;
        private double volume;
        private double mileage;

        public void turnOn() {
            System.out.println("car is on");
            isRunning = true;
        }

        public void turnOff() {
            System.out.println("car is off");
            isRunning = false;
        }
    }

    public void startACar() {
        engine.turnOn();
    }

    public void stopACar() {
        engine.turnOff();
    }
}
