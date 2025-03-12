package com.krao.orders_service.service.payment;

import org.springframework.stereotype.Component;

@Component("creditcard")
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(Double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
    }
}
