package observer;

import java.math.BigDecimal;

public class InvestorNotifier implements BitcoinPriceObserver {
    @Override
    public void update(BigDecimal price) {}
}
