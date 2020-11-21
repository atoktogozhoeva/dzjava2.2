package com.company;

public class Bmw extends Car {
    private String color;

    public Bmw(String model, double volume, String color) {
        super(model, volume);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void print(){
        super.print();
        System.out.println("Color: "+color);
    }
}
