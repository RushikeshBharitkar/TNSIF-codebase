package services;

import java.util.*;

import entities.Customer;
import entities.Product;

public class ProductService {

    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(int productId, String name, double price, int stockQuantity) {
        Product product = new Product(productId, name, price, stockQuantity);
        products.put(productId, product);
    }

    public void removeProduct(int productId) {
        products.remove(productId);
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("--- Products ---");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

	public Collection<Customer> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}
