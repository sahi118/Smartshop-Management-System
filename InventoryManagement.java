package smartshopManagement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

public class InventoryManagement {
    private ArrayList<Product> stock;
    public InventoryManagement() {
        this.stock = new ArrayList<>();
    }

    public String printStock() {
        StringBuilder sb = new StringBuilder();

        String[]columns  = {"Name","Price","Quantity"};
        DefaultTableModel model = new DefaultTableModel(columns,0);
        JTable table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane tabScrollPane = new JScrollPane(table);

        for (Product p : stock) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    public void addProduct(Product product) {
        this.stock.add(product);
    }
}
