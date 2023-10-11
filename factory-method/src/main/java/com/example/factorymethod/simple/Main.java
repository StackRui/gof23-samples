package com.example.factorymethod.simple;

import com.example.factorymethod.simple.SimpleCarFactory;

public class Main {
    public static void main(String[] args) {
        // 简单工厂
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        System.out.println(simpleCarFactory.createPRoduct("BMW").brand());
        System.out.println(simpleCarFactory.createPRoduct("JAC").brand());
        System.out.println(simpleCarFactory.createPRoduct("Audi").brand());

    }
}
