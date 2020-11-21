package com.company;

public class Car implements Printable {
    private String model;
    private double volume;

    public Car(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("model: "+model+"\nVolume: "+volume);
    }
}
