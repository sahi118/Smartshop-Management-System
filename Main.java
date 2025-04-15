package smartshopManagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main
{
    public static void main(String[] args)
	{
		JFrame menu = new JFrame();
		JFrame projManagement = new JFrame();
		
		JButton btn1 = new JButton("Manage Inventory");
		btn1.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(true);
		JButton btn2 = new JButton("Record Sales");
		btn2.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(true);
		JButton btn3 = new JButton("Generate Report");
		btn3.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(true);
		JButton buttonExit = new JButton("Quit");
		buttonExit.setFont(new Font("Tahoma",Font.BOLD, 15));
		buttonExit.setForeground(Color.WHITE);
		buttonExit.setBackground(Color.DARK_GRAY);
		buttonExit.setFocusPainted(false);
		buttonExit.setBorderPainted(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3,50,10));
		JLabel labelTitle = new JLabel("Title");
		labelTitle.setText("Smart Shop Management System");
		labelTitle.setHorizontalAlignment(JLabel.CENTER);
		labelTitle.setFont(new Font("Tahoma",Font.BOLD, 15));
		panel.add(labelTitle);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(buttonExit);

		JButton btn4 = new JButton("Add Product     ");
		btn4.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn4.setPreferredSize(new Dimension(200, 200));
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setFocusPainted(false);
		btn4.setBorderPainted(true);
		JButton btn5 = new JButton("Update Product");
		btn5.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn5.setPreferredSize(new Dimension(200, 200));
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setFocusPainted(false);
		btn5.setBorderPainted(true);
		JButton btn6 = new JButton("Delete Product ");
		btn6.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn6.setPreferredSize(new Dimension(200, 200));
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setFocusPainted(false);
		btn6.setBorderPainted(true);
		JButton btn7 = new JButton("Back");
		btn7.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setFocusPainted(false);
		btn7.setBorderPainted(true);
		JButton whitespace = new JButton("");

		JTextField addProductName = new JTextField();
		JTextField addProductPrice = new JTextField();
		JTextField addProductQuantity = new JTextField();
		JTextField updateProduct = new JTextField();

		InventoryManagement inventoryManagement = new InventoryManagement();
		inventoryManagement.printStock();

		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		JLabel managementTitle = new JLabel("Title");
		JLabel productName = new JLabel("Product Name");
		JLabel productPrice = new JLabel("Product Price");
		JLabel productQuantity = new JLabel("Product Quantity");
		JTextArea products = new JTextArea();
		products.setPreferredSize(new Dimension(100, 100));
		products.setEditable(false);
		JScrollPane productsScrollPane = new JScrollPane(products);
		managementTitle.setText("Product Management Centre");
		managementTitle.setHorizontalAlignment(JLabel.CENTER);
		managementTitle.setFont(new Font("Tahoma",Font.BOLD, 15));
		
		panel1.add(managementTitle, BorderLayout.NORTH);
		panel1.add(productName, BorderLayout.WEST);
		panel1.add(productPrice, BorderLayout.WEST);
		panel1.add(productQuantity, BorderLayout.WEST);
		JPanel TextPanel = new JPanel();
		BoxLayout boxlayout1 = new BoxLayout(TextPanel, BoxLayout.Y_AXIS); 
		TextPanel.setLayout(boxlayout1);
		TextPanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
		TextPanel.add(productsScrollPane);
		TextPanel.add(addProductName);
		TextPanel.add(addProductPrice);
		TextPanel.add(addProductQuantity);
		TextPanel.add(updateProduct);

		//panel1.add(whitespace);
		//panel1.add(whitespace);

		JPanel ButtonPanel = new JPanel();
		BoxLayout boxlayout2 = new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS); 
		ButtonPanel.setLayout(boxlayout2);
		ButtonPanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
		ButtonPanel.add(btn4);
		ButtonPanel.add(btn5);
		ButtonPanel.add(btn6);
		panel1.add(TextPanel, BorderLayout.CENTER);
		panel1.add(ButtonPanel, BorderLayout.EAST);
		panel1.add(btn7, BorderLayout.SOUTH);

		menu.add(panel);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setTitle("Smart Shop Management System");
		menu.setSize(300,550);
		menu.setLocationRelativeTo(null);

		projManagement.add(panel1);
		projManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		projManagement.setTitle("Smart Shop Management System");
		projManagement.setSize(750,500);
		projManagement.setLocationRelativeTo(null);


		menu.setVisible(true);
		projManagement.setVisible(false);

		buttonExit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFrame QuitFrame = new JFrame("Quit");
				if (JOptionPane.showConfirmDialog(QuitFrame,"Confirm if you Want to Quit","Quit?",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            	System.exit(0);}
		});
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				projManagement.setVisible(true);
				menu.setVisible(false);
			}
		});
		btn4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String productName = addProductName.getText();
				String productPrice = addProductPrice.getText();
				String productQuantity = addProductQuantity.getText();

				Product product = new Product(productName, productPrice, productQuantity);

				inventoryManagement.addProduct(product);
				String stockList = inventoryManagement.printStock();
				products.setText(stockList);
			}
		});
		btn7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				projManagement.setVisible(false);
				menu.setVisible(true);
			}
		});
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
		
}
