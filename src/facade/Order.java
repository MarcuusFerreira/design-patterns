package facade;

import java.math.BigDecimal;
import java.util.UUID;

public record Order(
        BigDecimal amount,
        String email,
        UUID productId,
        Integer quantity
) {

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", email='" + email + '\'' +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
