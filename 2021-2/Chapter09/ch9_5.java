package Chapter9;

import javax.swing.*;
import java.awt.*;

public class ch9_5 extends JFrame{
	public ch9_5() {
		setTitle("4x4 color Frame");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		for(int i = 0; i < 16; i++) {
			Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
					Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.RED,
					Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE};
			JLabel la = new JLabel(Integer.toString(i));
			la.setBackground(col[i]);
			la.setOpaque(true); //색깔 나오게 하는거
			c.add(la);
		}      
		setVisible(true);
	}
	public static void main(String[] args) {
		new ch9_5();
	}
}
