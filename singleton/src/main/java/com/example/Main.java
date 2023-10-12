package com.example;

import com.example.singleton.lazy.LazySingleton;
import com.example.singleton.staticinnerclass.StaticInnerClassSingleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance2 == instance1);

        StaticInnerClassSingleton instance3 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance4 = StaticInnerClassSingleton.getInstance();

        System.out.println(instance3 == instance4);

    }
}
