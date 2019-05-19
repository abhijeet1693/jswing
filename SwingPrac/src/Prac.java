import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Prac {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setLocation(50, 50);
		frame.setBounds(100, 100, 500, 300);
		frame.setTitle("My Frame");
		ImageIcon icon = new ImageIcon("d:/ser.jpg");
		frame.setIconImage(icon.getImage());
		Container c = frame.getContentPane();
		c.setBackground(Color.gray);
		frame.setResizable(false);
	}
}
