package com.krao.orders_service.service.impl;

import com.krao.orders_service.service.PaymentService;
import com.krao.orders_service.service.payment.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final Map<String, PaymentStrategy> paymentStrategyMap;

    @Autowired
    public PaymentServiceImpl(Map<String, PaymentStrategy> strategyMap) {
        this.paymentStrategyMap = strategyMap;
    }

    @Override
    public void processPayment(Double amount, String paymentType) {
        PaymentStrategy strategy = paymentStrategyMap.get(paymentType.toLowerCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        System.out.println("Processing payment of " + amount + " using " + paymentType);
        strategy.pay(amount);
    }
}
