package com.example.factorymethod;

public interface Factory<T extends BaseCar> {
    T createCar(String str);
}
