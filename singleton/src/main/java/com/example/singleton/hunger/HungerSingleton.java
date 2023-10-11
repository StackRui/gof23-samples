package com.example.singleton.hunger;

public class HungerSingleton {
    private static final HungerSingleton hungerSingleton = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }

    private HungerSingleton() {
    }
}
