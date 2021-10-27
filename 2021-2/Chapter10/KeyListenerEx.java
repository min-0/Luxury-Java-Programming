package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {
	private JLabel [] keyMessage; //3���� �޽����� ����� ���̺� ������Ʈ �迭
	public KeyListenerEx() {
		setTitle("KeyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		//���̺�迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
		keyMessage = new JLabel[3]; //���̺� �迭 ����
		keyMessage [0] = new JLabel(" getKeyCode() ");
		keyMessage [1] = new JLabel(" getKeyChar() ");
		keyMessage [2] = new JLabel(" getKeyText() ");
		
		//3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
		for(int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //������ ���̷� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	//Key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //Ű �ڵ� �˾Ƴ���
			char keyChar = e.getKeyChar(); //Ű ���� �� �˾Ƴ���
			keyMessage [0].setText(Integer.toString(keyCode)); //Ű �ڵ� ���
			keyMessage [1].setText(Character.toString(keyChar)); //Ű ���� ���
			keyMessage [2].setText(KeyEvent.getKeyText(keyCode)); //Ű �̸� ���ڿ� ���
			
			//�ܼ�â�� �� �޼ҵ� �̸� ���
			System.out.println("KeyPressed"); 
		}
		public void KeyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}
		public void KeyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
