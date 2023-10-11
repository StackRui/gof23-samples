package com.example.factorymethod.method;

import com.example.factorymethod.Car;
import com.example.factorymethod.Factory;

public interface Factories {
    Factory<? extends Car> getFactory(String brand);
}
