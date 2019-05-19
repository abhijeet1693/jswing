import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Prac4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 400, 200);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		JPasswordField pass = new JPasswordField();
		pass.setBounds(150, 150, 100, 50);
		pass.setEchoChar('*');
		pass.setText("124");
		c.add(pass);
		
		frame.setVisible(true);
	}
}
