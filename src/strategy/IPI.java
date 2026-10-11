package strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IPI implements TaxTypeInterface{

    private static final BigDecimal TAX_PERCENTAGE = BigDecimal.valueOf(15);
    private static final BigDecimal ONE_HUNDRED = BigDecimal.valueOf(100);

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        return amount
                .multiply(TAX_PERCENTAGE)
                .divide(ONE_HUNDRED, 2, RoundingMode.HALF_UP);
    }

}
