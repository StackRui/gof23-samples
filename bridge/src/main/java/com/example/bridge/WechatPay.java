package com.example.bridge;

/**
 * 抽象1的实现2
 */
public class WechatPay implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("微信支付 " + amount + " 元");
    }
}
