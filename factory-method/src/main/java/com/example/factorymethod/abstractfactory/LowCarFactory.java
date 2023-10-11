package com.example.factorymethod.abstractfactory;

import com.example.factorymethod.AudiCar;
import com.example.factorymethod.BaomaCar;
import com.example.factorymethod.BaseCar;
import com.example.factorymethod.JacCar;

public class LowCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }

    @Override
    public BaseCar createCar(String str) {
        if (str.equals("BMW")) {
            return new BaomaCar("宝马汽车", this.createEngine(), this.createSeat(), this.createTyre());
        } else if (str.equals("JAC")) {
            return new JacCar("江淮机车", this.createEngine(), this.createSeat(), this.createTyre());
        }
        return new AudiCar("奥迪汽车", this.createEngine(), this.createSeat(), this.createTyre());
    }
}
