package com.krao.orders_service.service.payment;

import org.springframework.stereotype.Component;

@Component("debitcard")
public class DebitCardPayment implements PaymentStrategy {

    @Override
    public void pay(Double amount) {
        System.out.println("Paying " + amount + " using Debit Card.");
    }
}
