package Chapter9;

import javax.swing.*;
import java.awt.*;

public class ch9_3 extends JFrame{
	public ch9_3() {
		setTitle("Ten Clolor Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		grid.setVgap(10);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i = 0; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setSize(70, 30);
			c.add(b);
		}
		
		setSize(700, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		ch9_3 frame = new ch9_3();
	}

}
