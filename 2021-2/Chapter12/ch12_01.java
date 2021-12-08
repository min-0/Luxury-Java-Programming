package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch12_01 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JButton btn = new JButton("Hide/Show");
	private ImageIcon icon = new ImageIcon("images/sky.jpg");
	private Image img = icon.getImage();
	
	int cnt = 0;
	
	public ch12_01() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		add(btn);
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cnt++;
				if(cnt % 2 == 0) {
					img = null;
					repaint();
				}
				else {
					img = icon.getImage();
					repaint();
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new ch12_01();
	}
}
