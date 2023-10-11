package com.example.factorymethod.abstractfactory;

public class Main {

    public static void main(String[] args) {
        // 抽象工厂
        CarFactory factory = new LowCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }

}
