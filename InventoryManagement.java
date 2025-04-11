package smartshopManagement;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class InventoryManagement {
    private ArrayList<Product> stock;
    public InventoryManagement() {
        this.stock = new ArrayList<>();
    }

    public String printStock() {
        StringBuilder sb = new StringBuilder();
        for (Product p : stock) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    public void addProduct(Product product) {
        this.stock.add(product);
    }
}
