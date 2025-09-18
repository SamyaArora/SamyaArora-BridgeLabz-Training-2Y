package Oops.ObjectOrientedDesignPrinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * Product class represents an item that can be purchased.
 * Fields: productName, quantity, pricePerUnit.
 */
class Product {
    // Fields based on the diagram
    private String productName;
    private int quantity; // Represents the quantity of this specific product item
    private double pricePerUnit;

    public Product(String productName, double pricePerUnit, int quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Method based on the diagram
    public double getCost() {
        return pricePerUnit * quantity;
    }

    // Getters for BillGenerator access
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

/**
 * Customer class represents the buyer.
 * It uses Composition to manage a list of purchased Products (items in the cart).
 */
class Customer {
    // Fields based on the diagram
    private String name;
    private int id;
    private List<Product> products; // Composition relationship

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.products = new ArrayList<>();
    }

    // Method based on the diagram
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // Method based on the diagram
    public List<Product> getProducts() {
        return products;
    }

    // Getters for BillGenerator access
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

/**
 * BillGenerator class handles the business logic of creating the bill.
 */
class BillGenerator {
    // Method based on the diagram: +generateBill(Customer)
    public double generateBill(Customer customer) {
        System.out.println("------------------------------------");
        System.out.println("Bill for Customer: " + customer.getName() + " (ID: " + customer.getId() + ")");
        System.out.println("------------------------------------");

        double totalAmount = 0;
        for (Product item : customer.getProducts()) {
            double cost = item.getCost();
            System.out.printf("%-15s x %2d @ $%-5.2f = $%.2f%n",
                    item.getProductName(), item.getQuantity(), item.getPricePerUnit(), cost);
            totalAmount += cost;
        }

        System.out.println("------------------------------------");
        System.out.printf("Total Payable Amount: $%.2f%n", totalAmount);
        System.out.println("------------------------------------");

        return totalAmount;
    }
}

/**
 * The main application class for the Grocery Store system.
 */
public class GroceryStore {

    private BillGenerator billGenerator = new BillGenerator(); // Uses relationship

    public void processTransaction(Customer customer) {
        // Implementation based on the 'uses' relationship with BillGenerator
        System.out.println("--- Starting Transaction for " + customer.getName() + " ---");
        billGenerator.generateBill(customer);
        System.out.println("--- Transaction Complete ---");
    }

    public static void main(String[] args) {
        // Create the main store instance
        GroceryStore store = new GroceryStore();

        // 1. Create a Customer object (Alice, ID 201) - from the Object Diagram
        Customer alice = new Customer("Alice", 201);

        // 2. Create Product items
        Product apple = new Product("Apple", 1.50, 5);
        Product milk = new Product("Milk", 4.99, 1);
        Product bread = new Product("Bread", 3.00, 2);

        // 3. Alice adds products to her cart (Composition)
        alice.addProduct(apple);
        alice.addProduct(milk);
        alice.addProduct(bread);

        // 4. Process the transaction and generate the bill (Uses)
        store.processTransaction(alice);
    }
}