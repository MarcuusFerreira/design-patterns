package observer;

public class ObserverClient {

    static void main() {
        var bitcoin = new Bitcoin();

        var priceLogger = new BinancePriceLogger();
        var newsPlataform = new NewsPlataform();
        var investorNotifier = new InvestorNotifier();

        bitcoin.addObservers(priceLogger);
        bitcoin.addObservers(newsPlataform);
        bitcoin.addObservers(investorNotifier);

        var binanceAPI = new BinanceAPI();
        var newPrice = binanceAPI.getLastPrice();
        bitcoin.setPrice(newPrice);
        IO.println(bitcoin);
    }
}
