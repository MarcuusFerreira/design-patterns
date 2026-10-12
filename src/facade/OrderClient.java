package facade;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderClient {

    private OrderFacade orderFacade;

    void main() {
        var orderDetails = new Order(
                BigDecimal.valueOf(1500),
                "email@example.com",
                UUID.randomUUID(),
                4
        );
        var processor = new PaymentProcessor();
        var notifier = new Notifier();
        var inventoryManager = new InventoryManager();
        var shippingService = new ShippingService();
        this.orderFacade = new OrderFacade(processor, notifier, inventoryManager, shippingService);
        orderFacade.processOrder(orderDetails);
    }

}
