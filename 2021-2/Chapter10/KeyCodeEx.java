package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel(); //�� ���̺� ������Ʈ ����
	public KeyCodeEx() {
		setTitle("KeyCode ����:F1:�ʷϻ�, %:�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener()); //����Ʈ�ҿ� Key�����ʸ� ����Ѵ�.
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		//����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		c.setFocusable(true);
		c.requestFocus();
	}
	//Key ������ ����
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();

			//la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "Ű�� �ԷµǾ���");
			
			if(e.getKeyChar() == '%') contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) contentPane.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
