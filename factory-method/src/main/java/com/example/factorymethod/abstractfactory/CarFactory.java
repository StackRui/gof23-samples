package com.example.factorymethod.abstractfactory;

import com.example.factorymethod.BaseCar;
import com.example.factorymethod.Factory;

public interface CarFactory extends Factory<BaseCar> {
        Engine createEngine();
        Seat createSeat();
        Tyre createTyre();
}
