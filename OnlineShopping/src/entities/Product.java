package entities;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %.2f, Stock: %d",
                productId, name, price, stockQuantity);
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

    // getters & setters if needed
}
