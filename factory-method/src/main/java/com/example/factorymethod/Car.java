package com.example.factorymethod;

import com.example.factorymethod.abstractfactory.Engine;
import com.example.factorymethod.abstractfactory.Seat;
import com.example.factorymethod.abstractfactory.Tyre;

public interface Car {
    String brand();
    String name();
    Engine engine();
    Seat seat();
    Tyre tyre();
}
