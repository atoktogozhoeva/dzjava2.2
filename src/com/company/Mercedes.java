package com.company;

public class Mercedes extends Car {
    private String brand;

    public Mercedes(String model, double volume, String brand) {
        super(model, volume);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void print(){
        super.print();
        System.out.println("brand: "+brand);
    }
}
