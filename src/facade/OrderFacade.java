package facade;

public class OrderFacade {

    private PaymentProcessor paymentProcessor;
    private Notifier notifier;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public OrderFacade(
            PaymentProcessor processor,
            Notifier notifier,
            InventoryManager inventoryManager,
            ShippingService shippingService
    ) {
        this.paymentProcessor = processor;
        this.notifier = notifier;
        this.inventoryManager = inventoryManager;
        this.shippingService = shippingService;
    }

    public void processOrder(Order order) {
        this.paymentProcessor.processPayment(order.amount());
        this.notifier.sendConfirmation(order.email());
        this.inventoryManager.updateStock(order.productId(), order.quantity());
        this.shippingService.initiateShipping(order);
    }
}
