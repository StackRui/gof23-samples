package com.example.factorymethod;

import com.example.factorymethod.abstractfactory.Engine;
import com.example.factorymethod.abstractfactory.Seat;
import com.example.factorymethod.abstractfactory.Tyre;

public class JacCar extends BaseCar {

    public JacCar(String name, Engine engine, Seat seat, Tyre tyre) {
        super(name, "jac", engine, seat, tyre);
    }
}
