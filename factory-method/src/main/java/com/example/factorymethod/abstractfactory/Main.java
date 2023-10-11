package com.example.factorymethod.abstractfactory;

import com.example.factorymethod.BaseCar;

public class Main {

    public static void main(String[] args) {
        // 抽象工厂
        CarFactory factory = new LowCarFactory();
        BaseCar car = factory.createCar("JAC");
        Engine engine = car.engine();
        engine.run();
        engine.start();
    }

}
