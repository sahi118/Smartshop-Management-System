package smartshopManagement;

public class Product {
    String name;
    Float price;
    Float quantity;

    public Product(String name, Float price, Float quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return name + " | £" + String.format("%.2f", price) + " | Qty: " + quantity;
    }
}
