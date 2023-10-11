package com.example.factorymethod.simple;

import com.example.factorymethod.*;

public class SimpleCarFactory implements Factory<BaseCar> {
    @Override
    public BaseCar createPRoduct(String str) {
        if (str.equals("BMW")) {
            return new BaomaCar("宝马汽车", null, null, null);
        } else if (str.equals("JAC")) {
            return new JacCar("江淮机车", null, null, null);
        }
        return new AudiCar("奥迪汽车", null, null, null);
    }
}
