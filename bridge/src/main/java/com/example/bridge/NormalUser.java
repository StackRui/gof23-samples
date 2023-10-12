package com.example.bridge;

// 扩展抽象部分 - 普通用户
public class NormalUser extends User {
    public NormalUser(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    public void purchase(double amount) {
        System.out.println("普通用户正在购买(不打折)...");
        paymentGateway.processPayment(amount);
    }
}
