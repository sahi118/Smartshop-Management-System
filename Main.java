//Importing Required Features
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main
{
    public static void main(String[] args)
	{
		//Creates JFrames used by our menus
		JFrame menu = new JFrame();
		JFrame projManagement = new JFrame();
		JFrame recordSales =  new JFrame();

		//Creates ArrayList for Generating Reports
		java.util.List<String> reportEntries = new java.util.ArrayList<>();
		
		//Creates the Manage Inventory Button for the main menu
		JButton btn1 = new JButton("Manage Inventory");
		btn1.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn1.setForeground(Color.decode("#E0F7FA"));
		btn1.setBackground(Color.decode("#004D40"));
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(true);
		btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn1.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn1.setBackground(Color.decode("#004D40")); // Resets hover colour to original
            }
        });
		
		//Creates the Record Sales Button for the main menu
		JButton btn2 = new JButton("Record Sales");
		btn2.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn2.setForeground(Color.decode("#E0F7FA"));
		btn2.setBackground(Color.decode("#004D40"));
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(true);
		btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn2.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn2.setBackground(Color.decode("#004D40")); 
            }
        });
		
		//Creates the Generate Report Button for the main menu
		JButton btn3 = new JButton("Generate Report");
		btn3.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn3.setForeground(Color.decode("#E0F7FA"));
		btn3.setBackground(Color.decode("#004D40"));
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(true);
		btn3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn3.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn3.setBackground(Color.decode("#004D40")); // Resets hover colour to original
            }
        });
		
		//Creates the Exit/Quit Button for the main menu
		JButton buttonExit = new JButton("Quit");
		buttonExit.setFont(new Font("Tahoma",Font.BOLD, 15));
		buttonExit.setForeground(Color.decode("#E0F7FA"));
		buttonExit.setBackground(Color.decode("#004D40"));
		buttonExit.setFocusPainted(false);
		buttonExit.setBorderPainted(true);
		buttonExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonExit.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                buttonExit.setBackground(Color.decode("#004D40")); // Resets hover colour to original
            }
        });
		//Creates the JPanel used on the main menu
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#B2DFDB"));
		panel.setLayout(new GridLayout(5,3,50,10));
		JLabel labelTitle = new JLabel("Title");
		labelTitle.setText("Smart Shop Management System");
		labelTitle.setHorizontalAlignment(JLabel.CENTER);
		labelTitle.setFont(new Font("Tahoma",Font.BOLD, 15));
		labelTitle.setForeground(Color.decode("#004D40"));
		panel.add(labelTitle);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(buttonExit);

		//Creates the Add Product Button used on the inventory management page
		JButton btn4 = new JButton("Add New Product");
		btn4.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn4.setPreferredSize(new Dimension(200, 200));
		btn4.setForeground(Color.decode("#E0F7FA"));
		btn4.setBackground(Color.decode("#004D40"));
		btn4.setFocusPainted(false);
		btn4.setBorderPainted(true);
		btn4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn4.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn4.setBackground(Color.decode("#004D40")); // Resets hover colour to original
            }
        });
		
		//Creates the Clear Product List Button used on the inventory management page
		JButton btn6 = new JButton("Clear Product List");
		btn6.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn6.setPreferredSize(new Dimension(200, 200));
		btn6.setForeground(Color.decode("#E0F7FA"));
		btn6.setBackground(Color.decode("#004D40"));
		btn6.setFocusPainted(false);
		btn6.setBorderPainted(true);
		btn6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn6.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn6.setBackground(Color.decode("#004D40")); // Resets hover colour to original
            }
        });

		//Creates the Add Product Button used on the Record Sales page
		JButton btnClr = new JButton("Clear Product List");
		btnClr.setFont(new Font("Tahoma",Font.BOLD, 15));
		btnClr.setForeground(Color.decode("#E0F7FA"));
		btnClr.setBackground(Color.decode("#004D40"));
		btnClr.setFocusPainted(false);
		btnClr.setBorderPainted(true);
		btnClr.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnClr.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnClr.setBackground(Color.decode("#004D40")); // Resets hover colour to original
            }
        });
		
		//Creates the back button used on the Record sales page
		JButton btn7 = new JButton("Back");
		btn7.setFont(new Font("Tahoma",Font.BOLD, 15));
		btn7.setForeground(Color.decode("#E0F7FA"));
		btn7.setBackground(Color.decode("#004D40"));
		btn7.setFocusPainted(false);
		btn7.setBorderPainted(true);
		btn7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn7.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn7.setBackground(Color.decode("#004D40")); // Resets hover colour to original
            }

        });

		//Creates the back Button used on the inventory management page
		JButton backBtn = new JButton("Back");
		backBtn.setFont(new Font("Tahoma",Font.BOLD, 15));
		backBtn.setForeground(Color.decode("#E0F7FA"));
		backBtn.setBackground(Color.decode("#004D40"));
		backBtn.setFocusPainted(false);
		backBtn.setBorderPainted(true);
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7.setBackground(Color.decode("#00796B")); // Button colour changes darker upon hovering
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn7.setBackground(Color.decode("#004D40")); // Resets hover colour to original
			}
		});

		//Creates text fields used on the Inventory Management page
		JTextField addProductName = new JTextField();
		JTextField addProductPrice = new JTextField();
		JTextField addProductQuantity = new JTextField();

		//Creates the JPanel used on the Inventory Management Page and modifies its apperance
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.decode("#B2DFDB"));
		panel1.setLayout(new BorderLayout());
		JLabel managementTitle = new JLabel("Title");
		JLabel productName = new JLabel("Product Name");
		JLabel productPrice = new JLabel("Product Price");
		JLabel productQuantity = new JLabel("Product Quantity");
		JPanel products = new JPanel();
		products.setLayout(new FlowLayout());
		products.setPreferredSize(new Dimension(100, 100));
		products.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		//Creates the title for the Inventory Management page
		managementTitle.setText("Product Management Centre");
		managementTitle.setHorizontalAlignment(JLabel.CENTER);
		managementTitle.setFont(new Font("Tahoma",Font.BOLD, 15));
		managementTitle.setForeground(Color.decode("#004D40"));
		
		// Adds the different product categories and title to the Inventory Management page
		panel1.add(managementTitle, BorderLayout.NORTH);
		panel1.add(productName, BorderLayout.WEST);
		panel1.add(productPrice, BorderLayout.WEST);
		panel1.add(productQuantity, BorderLayout.WEST);
		JPanel TextPanel = new JPanel();
		BoxLayout boxlayout1 = new BoxLayout(TextPanel, BoxLayout.Y_AXIS); 
		TextPanel.setLayout(boxlayout1);
		TextPanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
		TextPanel.setBackground(Color.decode("#B2DFDB"));
		//Adds the details to the text panel
		TextPanel.add(productName);
		TextPanel.add(addProductName);
		TextPanel.add(productPrice);
		TextPanel.add(addProductPrice);
		TextPanel.add(productQuantity);
		TextPanel.add(addProductQuantity);

		//Creates the adds the buttons to the button panel
		JPanel ButtonPanel = new JPanel();
		BoxLayout boxlayout2 = new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS); 
		ButtonPanel.setLayout(boxlayout2);
		ButtonPanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
		ButtonPanel.setBackground(Color.decode("#B2DFDB"));
		ButtonPanel.add(btn4);
		ButtonPanel.add(btn6);

		//adds the diffrent panels to the Panel1
		panel1.add(TextPanel, BorderLayout.CENTER);
		panel1.add(ButtonPanel, BorderLayout.EAST);
		panel1.add(btn7, BorderLayout.SOUTH);

		//Adds the panel to the main menu
		menu.add(panel);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setTitle("Smart Shop Management System");
		menu.setSize(300,550);
		//Sets the JFrames position to the centre of the screen
		menu.setLocationRelativeTo(null);

		//Adds panel1 to the Inventory Management JFrame
		projManagement.add(panel1);
		projManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		projManagement.setTitle("Smart Shop Management System");
		projManagement.setSize(750,500);
		//Sets the JFrames position to the centre of the screen
		projManagement.setLocationRelativeTo(null);

		//Creates a new JPanel for the Sales Record Frame
		JPanel salePanel = new JPanel();
		JPanel saleTextPanel = new JPanel();
		saleTextPanel.setBackground(Color.decode("#B2DFDB"));
		saleTextPanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
		saleTextPanel.setLayout(new BoxLayout(saleTextPanel, BoxLayout.Y_AXIS));

		//Adds the back and clear buttons to the Sale panel
		salePanel.add(backBtn);
		salePanel.add(btnClr);

		//Creates and modifies the apperance of the main Sale Panel JPanel
		JPanel mainSalePanel = new JPanel(new BorderLayout());
		mainSalePanel.setBackground(Color.decode("#B2DFDB"));
		mainSalePanel.add(salePanel, BorderLayout.NORTH);
		mainSalePanel.add(saleTextPanel, BorderLayout.CENTER);
		recordSales.add(mainSalePanel);
		recordSales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		recordSales.setTitle("Smart Shop Management System");
		recordSales.setSize(750,500);
		//Sets the JFrames position to the centre of the screen
		recordSales.setLocationRelativeTo(null);

		//Sets the menu visable when actiavting the program and hides everything else
		menu.setVisible(true);
		projManagement.setVisible(false);
		recordSales.setVisible(false);
		
		//Adds an action lsitener to the Exit button
		buttonExit.addActionListener((ActionEvent e) -> {
                    JFrame QuitFrame = new JFrame("Quit");
					//Gives the user the option to cancel or quit the system
                    if (JOptionPane.showConfirmDialog(QuitFrame,"Confirm if you Want to Quit","Quit?",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                        System.exit(0);
                });
		//Adds an action lsitener to the btn1
		btn1.addActionListener((ActionEvent e) -> {
					//Hides the menu page and shows the product management page
                    projManagement.setVisible(true);
                    menu.setVisible(false);
                });
		//Adds an action lsitener to the btn4		
		btn4.addActionListener((ActionEvent e) -> {
					//Checks to see if any of the text fields are empty
                    if (addProductName.getText().isEmpty())
					{
                        JOptionPane.showMessageDialog(null,"Fields cannot be empty!");
                    } 
					else if (addProductPrice.getText().isEmpty()) 		
					{
                        JOptionPane.showMessageDialog(null,"Fields cannot be empty!");
                    } 
					else if (addProductQuantity.getText().isEmpty()) 
					{
                        JOptionPane.showMessageDialog(null,"Fields cannot be empty!");
                    } 
					else 
					{			
						//Retrives the products variables and transfers them to the Product Class		
						Product.ProductName = addProductName.getText();
						Product.ProductPrice = addProductPrice.getText();
						Product.ProductQuantity = addProductQuantity.getText();	

						//Clears the text fields
						addProductName.setText("");
						addProductPrice.setText("");
						addProductQuantity.setText("");
				
						//Creates a new product
						Product product = new Product();
						saleTextPanel.add(product);			
						saleTextPanel.revalidate();

						//Informs the user via pop-up that the product has been added
						JOptionPane.showMessageDialog(null,"Product has been added");
						//Updates the arraylist for the generate report function
						String entry = "Name: " + Product.ProductName + ", Price: " + Product.ProductPrice + ", Quantity: " + Product.ProductQuantity;
						reportEntries.add(entry);
                    }
                });
		//Adds an action lsitener to the btn7
		btn7.addActionListener((ActionEvent e) -> {
					//Hides the project management page and shows the main menu
                    projManagement.setVisible(false);
                    menu.setVisible(true);
                });
		//Adds an action lsitener to the btn6
		btn6.addActionListener((ActionEvent e) -> {
			//clears the product list
			JFrame ClearFrame = new JFrame("Clear Product List");
			if (JOptionPane.showConfirmDialog(ClearFrame,"Are you sure you want to clear the product list?","",JOptionPane.WARNING_MESSAGE , JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			{
				saleTextPanel.removeAll();
				saleTextPanel.revalidate();
				saleTextPanel.repaint();
			}
		});
		//Adds an action lsitener to the btnClr
		btnClr.addActionListener((ActionEvent e) -> {
			//clears the product list
			JFrame ClearFrame = new JFrame("Clear Product List");
			if (JOptionPane.showConfirmDialog(ClearFrame,"Are you sure you want to clear the product list?","",JOptionPane.WARNING_MESSAGE , JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			{
				saleTextPanel.removeAll();
				saleTextPanel.revalidate();
				saleTextPanel.repaint();
			}
		});
		//Adds an action lsitener to the btn2
		btn2.addActionListener((ActionEvent e) -> {
					//Hides the main menu and shows the record sales page
                    menu.setVisible(false);
                    recordSales.setVisible(true);
                });
		//Adds an action lsitener to the backBtn
		backBtn.addActionListener((ActionEvent e) -> {
					//Shows the main menu and hides the record sales page
                    menu.setVisible(true);
                    recordSales.setVisible(false);
                });
		//Adds an action lsitener to the btn3
		btn3.addActionListener((ActionEvent e) -> {
			Component[] productComponents = saleTextPanel.getComponents();
			//Checks to see if the product list is empty
			if (productComponents.length == 0) {
				//Returns an error message via pop-up if the list is empty
				JOptionPane.showMessageDialog(null,"No products to add to report");
				return;
			}
			//Sends the array list of products to the Sales Record Class
			String[] report = new String[productComponents.length + 2];
			report[0] = "Sales Report";
			for (int i = 0; i < productComponents.length; i++) {
				Product p = (Product) productComponents[i];
				report[i + 1] = p.toString();
			}
			report[report.length - 1] = "==============";
			SalesRecord.fileGeneration(reportEntries);
		});
	}
}
