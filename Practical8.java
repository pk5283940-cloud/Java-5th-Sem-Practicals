// Practical 8: Constructor Overloading
class Product {
    String productName;
    double price;
    int quantity;

    Product() { this("Unnamed", 0.0, 0); }
    Product(String productName) { this(productName, 0.0, 0); }
    Product(String productName, double price) { this(productName, price, 1); }
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() { return price * quantity; }
    void display() {
        System.out.println(productName + " | Price: " + price
                + " | Quantity: " + quantity + " | Total: " + totalCost());
    }
}

public class Practical8 {
    public static void main(String[] args) {
        new Product().display();
        new Product("Pen").display();
        new Product("Notebook", 50).display();
        new Product("Bag", 800, 2).display();
    }
}
