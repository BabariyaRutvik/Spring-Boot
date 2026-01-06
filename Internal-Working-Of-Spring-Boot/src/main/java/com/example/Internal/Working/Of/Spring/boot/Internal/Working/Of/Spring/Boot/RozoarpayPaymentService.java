package com.example.Internal.Working.Of.Spring.boot.Internal.Working.Of.Spring.Boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RozoarpayPaymentService implements PaymentService {

    @Override
    public String pay() {
        return "RazorPay Payment";
    }
}
