package com.example.singleton.lazy;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    // volatile这个关键词不能少
                    // 因为 下面的这行代码实际有三个过程
                    // 1 分配内存
                    // 2 初始化
                    // 3 赋值
                    // 2和3是可能会出现重排序的，也就是说，其他线程获得的对象可能会是没初始化的对象！！！volatile禁止这种现象的发生
                    // volatile关键字的作用
                    // 1 禁止指令重新排序
                    // 2 保证变量的内存可见行，也就是一个变量变化了会立即通知cpu此变量缓存失效
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    private LazySingleton() {

    }
}
