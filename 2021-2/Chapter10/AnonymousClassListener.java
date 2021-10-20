package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton bt = (JButton)e.getSource();
				if(bt.getText().equals("Action")) bt.setText("�׼�");
				else bt.setText("Action");
				
				//AnonymousClassListener�� ����� JFrame�� ����� ȣ���� �� ����
				setTitle(bt.getText());
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}