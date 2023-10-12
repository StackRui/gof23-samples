package com.example;

import com.example.strategy.*;

public class Main {
    public static void main(String[] args) {
        // 策略上下文
        Context context = new Context(new OperationAdd());
        // 加法策略
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        // 减法策略
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        // 乘法策略
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        // 除法策略
        context = new Context(new OperationDivision());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
