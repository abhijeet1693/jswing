import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Prac2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 600);
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setText("Abhijeet");
		textField.setBounds(100, 50, 120, 30);
		textField.setEditable(true);
		c.add(textField);
		frame.setVisible(true);
	}
}
