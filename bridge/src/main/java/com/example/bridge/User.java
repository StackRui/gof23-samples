package com.example.bridge;


/**
 * 抽象2
 */
public abstract class User {
    protected PaymentGateway paymentGateway;

    public User(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void purchase(double amount);
}
