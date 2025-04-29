package smartshopManagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Product extends JPanel
{
    //Product List
    public static String ProductName;
    public static String ProductPrice;
    public static String ProductQuantity;

    //Sales Page
    public String ProductQuantityString;
    public int ProductQuantityInt;
    public String TotalSales;
    public JButton AddProduct;
    public JButton AddSales;

    //Report
    public String CompletedString;

    Product()
    {
        this.setPreferredSize(new Dimension(400,40));
        this.setBackground(Color.decode("#E0F7FA"));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new FlowLayout());

		JLabel productNameTitle = new JLabel("Name:");
        JLabel ProductName = new JLabel(Product.ProductName);
		JLabel productPriceTitle = new JLabel("£");
        JLabel ProductPrice = new JLabel(Product.ProductPrice);
		JLabel productQuantityTitle = new JLabel("Amt:");
        JLabel ProductQuantity = new JLabel(Product.ProductQuantity);
        JLabel TotalSalesTitle = new JLabel("Total Sales:");
        JLabel TotalSales = new JLabel("0");

        JButton AddProduct = new JButton("Increase Stock");
		AddProduct.setFont(new Font("Tahoma",Font.BOLD, 10));
		AddProduct.setForeground(Color.decode("#E0F7FA"));
		AddProduct.setBackground(Color.decode("#004D40"));
		AddProduct.setFocusPainted(false);
		AddProduct.setBorderPainted(true);
		AddProduct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                AddProduct.setBackground(Color.decode("#00796B"));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                AddProduct.setBackground(Color.decode("#004D40")); 
            }
        });
        AddProduct.addActionListener((ActionEvent e) -> {
            ProductQuantityString = ProductQuantity.getText();
            int ProductQuantityInt = Integer.parseInt(ProductQuantityString);
            

        });

        JButton AddSales = new JButton("Add Sale");
		AddSales.setFont(new Font("Tahoma",Font.BOLD, 10));
		AddSales.setForeground(Color.decode("#E0F7FA"));
		AddSales.setBackground(Color.decode("#004D40"));
		AddSales.setFocusPainted(false);
		AddSales.setBorderPainted(true);
		AddSales.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                AddSales.setBackground(Color.decode("#00796B"));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                AddSales.setBackground(Color.decode("#004D40")); 
            }
        });
        AddSales.addActionListener((ActionEvent e) -> {
            //add sales
        });
       
        this.add(productNameTitle);
        this.add(ProductName);
        this.add(productPriceTitle);
        this.add(ProductPrice);
        this.add(productQuantityTitle);
        this.add(ProductQuantity);
        this.add(TotalSalesTitle);
        this.add(TotalSales);
        this.add(AddProduct);
        this.add(AddSales);
    }
}
