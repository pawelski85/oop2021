package com.company.devices;

import java.util.List;
import java.util.Objects;

public class Phone extends Device implements Refillable {
    private static final String DEFAULT_VERSION = "latest";
    public final Double screenSize;
    /**
     * Task 1
     */
    public OperatingSystem os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, OperatingSystem os) {
        super(producer, model);
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }

    public void turnOn() {
        switch (this.os) {
            case iOS -> System.out.println("show bitten apple");
            case Android -> System.out.println("show litte robot");
            case WindowsMobile -> System.out.println("show 4 squares");
        }
    }

    @Override
    public void refill() {
        System.out.println("wire it into the recharger");
        System.out.println("wait");
        System.out.println("wait some more time");
    }

    @Override
    public void refillToFull() {
        System.out.println("wire it into the recharger");
        System.out.println("wait");
        System.out.println("wait as long as it is needed");
    }

    // difrent sockets:
    // HDMI/VGA/SOMEOTHER
    // that all do the same think
    // transfer data from laptop to the monitor

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION);
    }

    public void installAnApp(String appName, String version) {
        //check if have a space in mem
        //check if it's paid
        //check if I have money
        //pay
        //download
        //unzip
        //install
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        if (!super.equals(o)) return false;
        Phone phone = (Phone) o;
        return screenSize.equals(phone.screenSize) && os == phone.os;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenSize, os);
    }
}
