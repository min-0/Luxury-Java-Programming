package Chapter9;

import javax.swing.*;
import java.awt.*;

public class ch9_2 extends JFrame{
	public ch9_2() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(400, 200); //프레임 크기 300*200 설정
		setVisible(true);
	}
	public static void main(String[] args) {
		ch9_2 frame = new ch9_2();
	}

}
