package com.example;

import com.example.bridge.*;

public class Main {
    public static void main(String[] args) {
        PaymentGateway alipay = new AliPay();
        PaymentGateway weChatPay = new WechatPay();

        User premiumUser = new PremiumUser(alipay);
        premiumUser.purchase(100);

        User regularUser = new NormalUser(weChatPay);
        regularUser.purchase(50);
    }
}
