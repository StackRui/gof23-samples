package com.example.factorymethod.method;

import com.example.factorymethod.Car;
import com.example.factorymethod.Factory;

public class FactoriesSelector implements Factories {

    @Override
    public Factory<? extends Car> getFactory(String brand) {
        if (brand.equals("BMW")) {
            return new BaomaCarFactory();
        } else if (brand.equals("JAC")) {
            return new JacCarFactory();
        }
        return new AudiCarFactory();
    }
}
