package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch11_02 extends JFrame {
	private JTextField tf = new JTextField(10);
	private JComboBox<String> cb = new JComboBox<String>();
	public ch11_02() {
		setTitle("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tf);
		c.add(cb);
		
		setSize(300, 300);
		setVisible(true);
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String str = tf.getText();
					cb.addItem(str);
					tf.setText("");
				}
				else if(e.getKeyCode() == KeyEvent.VK_DELETE) {
					cb.removeItemAt(0); //첫번째 삭제
				}
			}
		});
	}
	public static void main(String[] args) {
		new ch11_02();
	}

}
