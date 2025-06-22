package service;
import java.util.HashMap;
import java.util.Map;

import model.Product;

public class InventorySystem {
    private Map<String, Product> inventory;

    public InventorySystem() {
        inventory = new HashMap<>();
    }

    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("✅ Product added: " + product);
    }

    public void updateProduct(String productId, int newQuantity, double newPrice) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("🔄 Product updated: " + product);
        } else {
            System.out.println("❌ Product ID not found!");
        }
    }

   
    public void deleteProduct(String productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("🗑️ Product removed: " + productId);
        } else {
            System.out.println("❌ Product ID not found!");
        }
    }

    
    public void showInventory() {
        System.out.println("\n📦 Current Inventory:");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    
}
