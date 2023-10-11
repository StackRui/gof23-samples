package com.example.factorymethod.method;

import com.example.factorymethod.Car;
import com.example.factorymethod.Factory;

public class Main {
    public static void main(String[] args) {
        // 工厂方法
        Factory<? extends Car> bmw = new FactoriesSelector().getFactory("BMW");
        System.out.println(bmw.createPRoduct("工厂方法生产的宝马汽车").name());

        Factory<? extends Car> jac = new FactoriesSelector().getFactory("JAC");
        System.out.println(jac.createPRoduct("工厂方法生产的宝马汽车").name());

        Factory<? extends Car> audi = new FactoriesSelector().getFactory("Audi");
        System.out.println(audi.createPRoduct("工厂方法生产的宝马汽车").name());

    }
}
