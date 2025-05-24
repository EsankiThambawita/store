package com.example.store;

public class OrderServce {
    public void placeOrder() {
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
