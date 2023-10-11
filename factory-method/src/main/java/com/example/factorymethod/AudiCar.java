package com.example.factorymethod;

import com.example.factorymethod.abstractfactory.Engine;
import com.example.factorymethod.abstractfactory.Seat;
import com.example.factorymethod.abstractfactory.Tyre;

public class AudiCar extends BaseCar {
    public AudiCar(String name, Engine engine, Seat seat, Tyre tyre) {
        super(name, "Audi", engine, seat, tyre);
    }
}
