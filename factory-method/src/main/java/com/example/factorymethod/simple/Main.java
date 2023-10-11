package com.example.factorymethod.simple;

public class Main {
    public static void main(String[] args) {
        // 简单工厂
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        System.out.println(simpleCarFactory.createCar("BMW").brand());
        System.out.println(simpleCarFactory.createCar("JAC").brand());
        System.out.println(simpleCarFactory.createCar("Audi").brand());

    }
}
