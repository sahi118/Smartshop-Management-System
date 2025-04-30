//Importing Required Features
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Product extends JPanel
{
    //Creating the Product Variables
    public static String ProductName;
    public static String ProductPrice;
    public static String ProductQuantity;
    //Creating Variables used for modifying Total sales and quanity (Strings)
    public static String NewQuantityString;
    public String NewSaleString;
    public static int NewQuanityTotalString;
    public static String CurrentQuanityString;
    public static String NewSaleTotalString;
    public String ProductQuantityString;
    public String TotalSales;
    //Creating Variables used for modifying Total sales and quanity (Int)
    public static int NewQuantityInt;
    public static int NewQuanityTotalInt;
    public static int NewSaleInt;
    public static int CurrentQuanityInt;
    public static int NewSaleTotalInt; 
    public int ProductQuantityInt;
    //Creating Buttons
    public JButton AddProduct;
    public JButton AddSales;
    //Used For Report Generation
    public String CompletedString;

    //Creating the Product Class
    Product()
    {
        //Seting the Design and layout of the new product
        this.setPreferredSize(new Dimension(100,40));
        this.setBackground(Color.decode("#E0F7FA"));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new FlowLayout());

        //Text for the New Product
		JLabel productNameTitle = new JLabel("Name:");
        JLabel ProductName = new JLabel(Product.ProductName);
		JLabel productPriceTitle = new JLabel("£");
        JLabel ProductPrice = new JLabel(Product.ProductPrice);
		JLabel productQuantityTitle = new JLabel("Amt:");
        JLabel ProductQuantity = new JLabel(Product.ProductQuantity);
        JLabel TotalSalesTitle = new JLabel("Total Sales:");
        JLabel TotalSales = new JLabel("0");

        //Creating and modfing the look of the Increase Stock Button
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
            JFrame AddStock = new JFrame("Add Stock");
            JTextArea StockTitle = new JTextArea("Add Stock");
            JTextField NewStock = new JTextField();
            Object[] TextFields = {"Add Stock:", NewStock}; 
            //First half of calculating the new value of the quantity
            ProductQuantityString = ProductQuantity.getText();
            int ProductQuantityInt = Integer.parseInt(ProductQuantityString);         
            //Adding an Action Listener to the button
            if (JOptionPane.showConfirmDialog(StockTitle, TextFields, "Add Stock", JOptionPane.CANCEL_OPTION)==JOptionPane.YES_OPTION)
            {
                if (NewStock.getText().isEmpty())
                {
                    //Runs if the text field is left empty
                    JOptionPane.showMessageDialog(null,"Field cannot be empty!");          
                }
                else
                {
                    //Second half of calculating the new value of the quantity
                    NewQuantityString = NewStock.getText();
                    int NewQuantityInt = Integer.parseInt(NewQuantityString);
                    int NewQuantityTotalInt = ProductQuantityInt + NewQuantityInt;
                    String NewQuantityTotalString = Integer.toString(NewQuantityTotalInt);
                    ProductQuantity.setText(NewQuantityTotalString);
                    this.revalidate();
                }
            };
        });
        //Creating and modfing the look of the Add Sales Button
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
        //Adding an Action Listener to the button
        AddSales.addActionListener((ActionEvent e) -> {
            JFrame AddSalesFrame = new JFrame("Sales");
            JTextArea SalesTitle = new JTextArea();
            JTextField NewSale = new JTextField();
            Object[] TextFields = {"Sales:", NewSale}; 

            if (JOptionPane.showConfirmDialog(SalesTitle, TextFields, "New Sale", JOptionPane.CANCEL_OPTION)==JOptionPane.YES_OPTION)
            {
                //First half of calculating the new value of the quantity and total sales
                NewSaleString = NewSale.getText();
                int NewSaleInt = Integer.parseInt(NewSaleString);
                CurrentQuanityString = ProductQuantity.getText();
                int CurrentQuanityInt = Integer.parseInt(CurrentQuanityString);        
                if (NewSale.getText().isEmpty())
                {
                    //Runs if the text field is left empty
                    JOptionPane.showMessageDialog(null,"Field cannot be empty!");          
                }
                else if (CurrentQuanityInt < NewSaleInt)
                {
                    //Runs if the inputted number is more than the current quanity
                    JOptionPane.showMessageDialog(null,"Sale cannot exceed total product amount!");
                }
                else
                {   
                    //Second half of calculating the new value of the quantity and total sales
                    CurrentQuanityInt = CurrentQuanityInt - NewSaleInt;
                    NewSaleTotalInt = NewSaleTotalInt + NewSaleInt;
                    String CurrentQuanityString = Integer.toString(CurrentQuanityInt);
                    ProductQuantity.setText(CurrentQuanityString);
                    String NewSaleTotalString = Integer.toString(NewSaleTotalInt);
                    TotalSales.setText(NewSaleTotalString);
                    this.revalidate();
                }
            };
        });
       
        //Adds the new and updated variables to the new product
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

    //Returns a string for the generate report
    public String toString() {
        return "Name: " + ProductName + ", Price: " + ProductPrice + ", Quantity: " + ProductQuantity;
    }
}
