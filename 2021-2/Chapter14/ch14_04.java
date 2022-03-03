package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_04 extends JFrame { 
	private Container contentPane;
	public ch14_04() {
		setTitle("���ڰ� �ƴ� Ű�� �ԷµǴ� ��� ���â �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(450, 300);
		setVisible(true);
		
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}
	private void createToolBar() {
		JToolBar toolbar = new JToolBar();
		JTextField tf = new JTextField();
		
		toolbar.add(new JLabel("�й�"));
		toolbar.add(tf);
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				//int code = (int)e.getKeyChar(); //code < 48 || code > 57
				if(e.getKeyChar() < '0' || e.getKeyChar() > '9') {
					e.consume(); //�Է��� �� ���� ������
					JOptionPane.showMessageDialog(null , e.getKeyChar()+"�� ���� Ű�� �ƴմϴ�. \n ���ڸ� �Է��ϼ���.", "���", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(toolbar, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new ch14_04();
	}
}
