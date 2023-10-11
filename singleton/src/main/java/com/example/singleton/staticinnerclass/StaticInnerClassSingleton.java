package com.example.singleton.staticinnerclass;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        // 避免反射破坏单例
        if (StaticInnerClassSingletonHolder.sis != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHolder.sis;
    }

    private static class StaticInnerClassSingletonHolder {
        private static final StaticInnerClassSingleton sis = new StaticInnerClassSingleton();
    }
}
