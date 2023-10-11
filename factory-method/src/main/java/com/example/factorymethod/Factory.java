package com.example.factorymethod;

public interface Factory<T extends BaseCar> {
    T createPRoduct(String str);
}
