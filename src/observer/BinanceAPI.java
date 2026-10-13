package observer;

import java.math.BigDecimal;
import java.security.SecureRandom;

public class BinanceAPI {

    public BigDecimal getLastPrice() {
        return BigDecimal.valueOf(new SecureRandom().nextInt(0, 1_000_000));
    }

}
