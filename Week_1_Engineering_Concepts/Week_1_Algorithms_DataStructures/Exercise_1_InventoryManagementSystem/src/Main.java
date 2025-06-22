import model.Product;
import service.InventorySystem;

public class Main {
    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();

        Product p1 = new Product("P101", "Mouse", 100, 299.99);
        Product p2 = new Product("P102", "Keyboard", 50, 499.49);

        system.addProduct(p1);
        system.addProduct(p2);

        system.showInventory();

        system.updateProduct("P101", 80, 279.99);
        system.deleteProduct("P102");

        system.showInventory();
    }
}
