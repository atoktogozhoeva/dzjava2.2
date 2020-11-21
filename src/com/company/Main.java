package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        creatObject("Bmw").print();
        creatObject("Mercedes").print();
        creatObject("Lexus").print();
    }
    public static Printable creatObject(String className) {

        if (className == null) {
            return null;
        }
        Printable a = null;
        switch (className) {
            case "Bmw":
                a = new Bmw("x5",4.4,"black");
                break;
            case "Mercedes":
                a = new Mercedes("s class",3.2,"S class");
                break;
            case "Lexus":
                a = new Lexus("LX 570",5.7,2020);
        }
        return a;
    }
}

