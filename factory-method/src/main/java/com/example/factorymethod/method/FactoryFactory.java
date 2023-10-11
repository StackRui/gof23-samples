package com.example.factorymethod.method;

import com.example.factorymethod.BaseCar;
import com.example.factorymethod.Factory;

public interface FactoryFactory {
    Factory<BaseCar> getFactory();
}
