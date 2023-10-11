package com.example.factorymethod;

import com.example.factorymethod.abstractfactory.Engine;
import com.example.factorymethod.abstractfactory.Seat;
import com.example.factorymethod.abstractfactory.Tyre;

public class BaomaCar extends BaseCar {

    public BaomaCar(String name,  Engine engine, Seat seat, Tyre tyre) {
        super(name, "bmw", engine, seat, tyre);
    }
}
