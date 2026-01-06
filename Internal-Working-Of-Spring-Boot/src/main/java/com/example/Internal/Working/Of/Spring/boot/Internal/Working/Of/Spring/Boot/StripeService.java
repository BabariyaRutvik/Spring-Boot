package com.example.Internal.Working.Of.Spring.boot.Internal.Working.Of.Spring.Boot;

import com.example.Internal.Working.Of.Spring.boot.Internal.Working.Of.Spring.Boot.PaymentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class StripeService implements PaymentService {

    @Override
    public String pay() {
        return "Stripe Payment";
    }
}
