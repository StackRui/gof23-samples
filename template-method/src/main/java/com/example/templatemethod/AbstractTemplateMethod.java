package com.example.templatemethod;

public abstract class AbstractTemplateMethod {

    protected abstract void method1();

    protected abstract void method2();

    protected abstract void method3();

    public void start() {
        System.out.println("开始处理模板");
        System.out.println("pre method1");
        method1();
        System.out.println("post method1");
        System.out.println("pre method2");
        method2();
        System.out.println("post method2");
        System.out.println("pre method3");
        method3();
        System.out.println("post method3");
        System.out.println("结束处理模板");
    }
}
