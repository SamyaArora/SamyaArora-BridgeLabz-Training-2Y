package Oops.Java_Classes_and_Objects.Level1;

public class Item {private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item("IT001", "Laptop", 80000.0);
        item.displayDetails();
        System.out.println("Total cost for 2 units: " + item.calculateTotalCost(2));
    }
}


