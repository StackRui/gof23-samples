package com.example.bridge;

/**
 * 抽象1的实现1
 */
public class AliPay implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("阿里巴巴支付 " + amount+" 元");
    }
}
