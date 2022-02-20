package com.company.devices;

import java.util.Objects;

public abstract class Device {
    public String producer;
    public String model;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    abstract public void turnOn();

    public String toString() {
        return producer + " " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return producer.equals(device.producer) && model.equals(device.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }
}
