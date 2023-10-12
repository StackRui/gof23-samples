package com.example.bridge;

// 扩展抽象部分 - 会员用户
public class PremiumUser extends User {
    public PremiumUser(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    public void purchase(double amount) {
        System.out.println("会员用户正在购买（9折优惠）...");
        paymentGateway.processPayment(amount * 0.9); // 享受9折优惠
    }
}
