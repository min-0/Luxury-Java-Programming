package Chapter11;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("images/call.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/green.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/red.jpg");
		
		//3���� �̹����� ���� ��ư ����
		JButton btn = new JButton("Call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}

}
