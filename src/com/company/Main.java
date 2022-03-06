package com.company;

import com.company.devices.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog", FoodType.ALL);

        dog.name = "Szarik";
//
//        Human me = new Human(1000.0);
//        me.firstName = "Kacper";
//        me.lastName = "Warda";
//        me.pet = dog;
//        me.hashCode();
//
//        me.feed(1.0);
//        System.out.println(me.species);
//
//        Phone onePlus = new Phone("onePlus",
//                "8Pro",
//                2.3,
//                OperatingSystem.Android);
//
//        Phone iPhone6 = new Phone("apple", "6s", 5.0, OperatingSystem.iOS);
//
//        System.out.println("phone: " + onePlus);
//        System.out.println("phone: " + iPhone6);
//        System.out.println("human: " + me);
//
//
//        onePlus.turnOn();
//
//        Car fiat = new Car("fiat", "bravo");
//        fiat.engineSize = 1.9;
//        fiat.fuelType = "disel";
//        System.out.println(fiat.producer);
        //        Human brother = new Human(1231.2);

//        dog.sell(me, brother, 1.0);
/**
 * Task 2
 */
        dog.feed(1.0, FoodType.ALL);

/**
 * Task 3
 */
        System.out.println(Country.RUSSIA.getGdp());

/**
 * TASK 4
 */
        Map<Country, Double> countries = Map.of(Country.RUSSIA, Country.RUSSIA.getGdp(),
                Country.UKRAINE, Country.UKRAINE.getGdp(),
                Country.USA, Country.USA.getGdp());

        Map.Entry<Country, Double> min = Collections.min(countries.entrySet(),
                Map.Entry.comparingByValue());
        System.out.println(min.getValue());

        Map.Entry<Country, Double> max = Collections.max(countries.entrySet(),
                Map.Entry.comparingByValue());
        System.out.println(max.getValue());
/**
 * TASK 5
 */
        Map<String, Country> capitals = Map.of("Moscov", Country.RUSSIA,
                "Kiev", Country.UKRAINE,
                "Washington", Country.USA);

        List<String> list = new ArrayList<>(capitals.keySet());
        Collections.sort(list);
        System.out.println(list);
/**
 * TASK 6
 * Create a HashMap with String producer as key and list of devices as value.
 * Add a few objects into the map.
 * Find all devices produced by Ford and Siemens.
 */

        Map<String, List> devices = new HashMap<>();

        Device car = new Car("Ford", "fiesta");
        Device car2 = new Car("Ford", "mondeo");
        Device phone = new Phone("Siemens", "x1", 14.0, OperatingSystem.Android);
        Device phone2 = new Phone("Siemens", "x2", 14.0, OperatingSystem.Android);

        List<Device> deviceList = new ArrayList<>();
        List<Device> deviceList2 = new ArrayList<>();

        deviceList.add(car);
        deviceList.add(car2);

        deviceList2.add(phone);
        deviceList2.add(phone2);

        devices.put("Ford", deviceList);
        devices.put("Siemens", deviceList2);

        System.out.println(devices.get("Ford"));
        System.out.println(devices.get("Siemens"));
    }
}
