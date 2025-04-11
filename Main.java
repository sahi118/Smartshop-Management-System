package smartshopManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
	{
		JFrame menu = new JFrame();
		JFrame projManagement = new JFrame();
		
		JButton btn1 = new JButton("Manage Inventory");
		JButton btn2 = new JButton("Record Sales");
		JButton btn3 = new JButton("Generate Report");
		JButton buttonExit = new JButton("Quit");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,1,50,10));
		JLabel labelTitle = new JLabel("Title");
		labelTitle.setText("Smart Shop Management System");
		labelTitle.setHorizontalAlignment(JLabel.CENTER);
		labelTitle.setFont(new Font("Tahoma",Font.BOLD, 15));
		panel.add(labelTitle);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(buttonExit);

		JButton btn4 = new JButton("Add Product");
		JButton btn5 = new JButton("Update Product");
		JButton btn6 = new JButton("Delete Product");
		JButton btn7 = new JButton("Back");
		JButton whitespace = new JButton("");

		JTextField addProduct = new JTextField();
		JTextField updateProduct = new JTextField();

		InventoryManagement inventoryManagement = new InventoryManagement();
		inventoryManagement.printStock();

		Product product = new Product("Eggs", 5f, 10f);
		inventoryManagement.addProduct(product);
		String stockList = inventoryManagement.printStock();

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5,2,50,10));
		JLabel managementTitle = new JLabel("Title");
		JTextArea products = new JTextArea();
		products.setText(stockList);
		products.setEditable(false);
		JScrollPane productsScrollPane = new JScrollPane(products);
		managementTitle.setText("Product Management Centre");
		managementTitle.setHorizontalAlignment(JLabel.CENTER);
		managementTitle.setFont(new Font("Tahoma",Font.BOLD, 15));


		panel1.add(managementTitle);
		panel1.add(productsScrollPane);
		panel1.add(whitespace);
		panel1.add(whitespace);
		panel1.add(addProduct);
		panel1.add(btn4);
		panel1.add(updateProduct);
		panel1.add(btn5);
		panel1.add(btn6);
		panel1.add(btn7);


		menu.add(panel);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setTitle("Smart Shop Management System");
		menu.setSize(300,550);
		menu.setLocationRelativeTo(null);

		projManagement.add(panel1);
		projManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		projManagement.setTitle("Smart Shop Management System");
		projManagement.setSize(1270,1080);
		projManagement.setLocationRelativeTo(null);


		menu.setVisible(true);
		projManagement.setVisible(false);

		buttonExit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				JFrame QuitFrame = new JFrame("Quit");
				if (JOptionPane.showConfirmDialog(QuitFrame,"Confirm if you Want to Quit","Quit?",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            	System.exit(0);}
		});
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				projManagement.setVisible(true);
				menu.setVisible(false);
			}
		});
		btn4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

			}
		});
	}
		
	
}
