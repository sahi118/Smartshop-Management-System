package smartshopManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Main
{
    public static void main(String[] args)
	{
        	JFrame menu = new JFrame();
		
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
		
		menu.add(panel);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setTitle("Smart Shop Management System");
		menu.setSize(300,550);
		menu.setLocationRelativeTo(null); 
		menu.setVisible(true);

		buttonExit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				JFrame QuitFrame = new JFrame("Quit");
				if (JOptionPane.showConfirmDialog(QuitFrame,"Confirm if you Want to Quit","Quit?",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            	System.exit(0);}
		});
	}
		
	
}
