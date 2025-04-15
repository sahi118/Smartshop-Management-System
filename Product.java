package smartshopManagement;

public class Product {
    String name;
    String price;
    String quantity;

    public Product(String name, String price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return name + " | £" + ( price) + " | Qty: " + quantity;
    }
}
