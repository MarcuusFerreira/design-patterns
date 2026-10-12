package facade;

import java.math.BigDecimal;

public class PaymentProcessor {

    public void processPayment(BigDecimal amount) {
        System.out.printf("\nAmount: %s", amount);
    }

}
