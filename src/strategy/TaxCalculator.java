package strategy;

import java.math.BigDecimal;

public class TaxCalculator {

    private TaxTypeInterface taxType;

    public BigDecimal calculate(BigDecimal amount) {
        return this.taxType.calculate(amount);
    }

    public TaxCalculator setTaxType(TaxTypeInterface taxType) {
        this.taxType = taxType;
        return this;
    }
}
