package facade;

import java.util.UUID;

public class InventoryManager {

    public void updateStock(UUID productId, Integer quantity) {
        System.out.printf("\nProduct: %s\nQuantity: %s", productId, quantity);
    }
}
