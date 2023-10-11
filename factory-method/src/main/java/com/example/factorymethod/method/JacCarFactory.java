package com.example.factorymethod.method;

import com.example.factorymethod.Factory;
import com.example.factorymethod.JacCar;

public class JacCarFactory implements Factory<JacCar> {
    @Override
    public JacCar createPRoduct(String name) {
        return new JacCar(name,null, null, null);
    }
}
