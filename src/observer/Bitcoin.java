package observer;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Bitcoin {

    private BigDecimal price;
    private List<BitcoinPriceObserver> observers;

    public Bitcoin() {
        this.price = BigDecimal.ZERO;
        this.observers = List.of();
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal newPrice) {
        Objects.requireNonNull(newPrice, "Novo preço não pode ser nulo");
        if (this.price.compareTo(newPrice) != 0) {
            this.price = newPrice;
            this.notifyObservers();
        }
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "price=" + price +
                '}';
    }

    public void addObservers(BitcoinPriceObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        observers.forEach(o -> o.update(this.price));
    }
}
