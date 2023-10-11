package com.example.templatemethod;

public class MyTemplate extends BaseTemplate{

    @Override
    protected void method2() {
        System.out.println("开始执行MyTemplate#method2");
    }

    @Override
    protected void method3() {
        System.out.println("开始执行MyTemplate#method3");
    }
}
