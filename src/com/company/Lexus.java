package com.company;

public class Lexus extends Car {
    private int year;

    public Lexus(String model, double volume, int year) {
        super(model, volume);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void print(){
        super.print();
        System.out.println("year: "+year);
    }
}
