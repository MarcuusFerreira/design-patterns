package observer;

import java.math.BigDecimal;

public class BinancePriceLogger implements BitcoinPriceObserver {
    @Override
    public void update(BigDecimal price) {}
}
