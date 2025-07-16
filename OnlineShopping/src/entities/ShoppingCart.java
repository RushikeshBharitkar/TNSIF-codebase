package entities;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();  // ✅ initialized
    }

    public void addProduct(Product p, int quantity) {
        items.put(p, items.getOrDefault(p, 0) + quantity);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Shopping Cart:\n");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            sb.append("  ").append(entry.getKey().toString())
              .append(", Quantity: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

	public void addProduct1(Customer p, int qty) {
		// TODO Auto-generated method stub
		
	}
}
