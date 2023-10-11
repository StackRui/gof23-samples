package com.example.factorymethod;

import com.example.factorymethod.abstractfactory.Engine;
import com.example.factorymethod.abstractfactory.Seat;
import com.example.factorymethod.abstractfactory.Tyre;

public class BaseCar implements Car {
    private final String name;
    private final String brand;
    private final Engine engine;
    private final Seat seat;
    private final Tyre tyre;

    public BaseCar(String name, String brand, Engine engine, Seat seat, Tyre tyre) {
        this.name = name;
        this.brand = brand;
        this.engine = engine;
        this.seat = seat;
        this.tyre = tyre;
    }


    @Override
    public String brand() {
        return brand;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Engine engine() {
        return engine;
    }

    @Override
    public Seat seat() {
        return seat;
    }

    @Override
    public Tyre tyre() {
        return tyre;
    }

}
