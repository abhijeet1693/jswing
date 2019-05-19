import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prac1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 300);
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		ImageIcon img = new ImageIcon("d:/ser.jpg");
		JLabel label = new JLabel();
		label.setIcon(img);
		label.setBounds(100, 50,img.getIconWidth() ,img.getIconHeight());
		//Font font = new Font("Arial", Font.PLAIN, 30);
		//label.setFont(font);
		c.add(label);
	}
}
