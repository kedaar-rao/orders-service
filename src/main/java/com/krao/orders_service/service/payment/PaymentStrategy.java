package com.krao.orders_service.service.payment;

public interface PaymentStrategy {
    void pay(Double amount);
}
