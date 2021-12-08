package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch12_05 extends JFrame {
	private MyPanel panel = new MyPanel();
	private ImageIcon icon = new ImageIcon("images/bubble.png");
	private Image img = icon.getImage();
	private int width = img.getWidth(this);
	private int height = img.getHeight(this);
	
	public ch12_05() {
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400,450);
		setVisible(true);
		
		//key리스너 사용시 꼭 사용해야 함 !!!
		panel.setFocusable(true);
		panel.requestFocus();
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
		public MyPanel() {
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						width *= 1.1;
						height *= 1.1;
						repaint();
					}
					else if(e.getKeyCode() == KeyEvent.VK_MINUS) {
						width *= 0.9;
						height *= 0.9;
						repaint();
					}
				}
			});
		}
	}
	public static void main(String[] args) {
		new ch12_05();
	}

}
