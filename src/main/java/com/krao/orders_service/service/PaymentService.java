package com.krao.orders_service.service;

public interface PaymentService {
    void processPayment(Double amount, String paymentType);
}
