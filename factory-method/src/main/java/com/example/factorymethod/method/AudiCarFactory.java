package com.example.factorymethod.method;

import com.example.factorymethod.AudiCar;
import com.example.factorymethod.Factory;

public class AudiCarFactory implements Factory<AudiCar> {
    @Override
    public AudiCar createCar(String name) {
        return new AudiCar(name, null, null, null);
    }
}
