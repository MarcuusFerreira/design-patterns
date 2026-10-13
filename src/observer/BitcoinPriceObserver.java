package observer;

import java.math.BigDecimal;

public interface BitcoinPriceObserver {

    void update(BigDecimal price);

}
