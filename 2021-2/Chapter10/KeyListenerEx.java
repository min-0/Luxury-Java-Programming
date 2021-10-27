package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {
	private JLabel [] keyMessage; //3개의 메시지를 출력할 레이블 컴포넌트 배열
	public KeyListenerEx() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		//레이블배열을 3개 생성하고 각 레이블 컴포넌트 생성
		keyMessage = new JLabel[3]; //레이블 배열 생성
		keyMessage [0] = new JLabel(" getKeyCode() ");
		keyMessage [1] = new JLabel(" getKeyChar() ");
		keyMessage [2] = new JLabel(" getKeyText() ");
		
		//3개의 레이블 컴포넌트를 컨텐트팬에 부착
		for(int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //배경색이 보이록 불투명 속성 설정
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	//Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //키 코드 알아내기
			char keyChar = e.getKeyChar(); //키 문자 값 알아내기
			keyMessage [0].setText(Integer.toString(keyCode)); //키 코드 출력
			keyMessage [1].setText(Character.toString(keyChar)); //키 문자 출력
			keyMessage [2].setText(KeyEvent.getKeyText(keyCode)); //키 이름 문자열 출력
			
			//콘솔창에 각 메소드 이름 출력
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
