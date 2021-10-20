package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		//Action �̺�Ʈ ������ �ޱ�
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	//���� Ŭ���� Action �����ʸ� �ۼ��Ѥ���
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton bt = (JButton)e.getSource();
			if(bt.getText().equals("Action")) bt.setText("�׼�");
			else bt.setText("Action");
			
			//InnerClassListener�� ����� JFrame�� ����� ȣ���� �� ����
			InnerClassListener.this.setTitle(bt.getText()); //�������� Ÿ��Ʋ�� ��ư ���ڿ��� ����Ѵ�.
		}
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}

}