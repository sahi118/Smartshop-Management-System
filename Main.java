package smartshopManagement;
import java.awt.GridLayout;
import javax.swing.*;

public class Main {

    public Main(){
        JFrame menu = new JFrame();
		
		JButton btn1 = new JButton("Manage Inventory");
		JButton btn2 = new JButton("Record Sales");
		JButton btn3 = new JButton("Generate Report");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,1,50,50));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		menu.add(panel);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setTitle("Smart Shop Management System");
		menu.setSize(300,550);
		menu.setVisible(true);
		
	}

    
    public static void main(String[] args) {
        new Main();
    }
}

