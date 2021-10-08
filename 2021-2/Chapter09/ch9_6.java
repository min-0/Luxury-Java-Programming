package Chapter9;

import javax.swing.*;
import java.awt.*;

public class ch9_6 extends JFrame{
	public ch9_6() {
		setTitle("Random Labels");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i = 0; i < 21; i++) {
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			JLabel la = new JLabel(Integer.toString(i));
			la.setLocation(x, y);
			la.setSize(10, 10);
			la.setOpaque(true);
			la.setBackground(Color.BLUE);
			c.add(la);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch9_6();
	}

}
