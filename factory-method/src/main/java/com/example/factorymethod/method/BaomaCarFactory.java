package com.example.factorymethod.method;

import com.example.factorymethod.BaomaCar;
import com.example.factorymethod.Factory;
import com.example.factorymethod.JacCar;

public class BaomaCarFactory implements Factory<BaomaCar> {
    @Override
    public BaomaCar createPRoduct(String name) {
        return new BaomaCar(name,null, null, null);
    }
}
