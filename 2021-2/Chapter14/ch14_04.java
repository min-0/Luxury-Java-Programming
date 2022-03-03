package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_04 extends JFrame { 
	private Container contentPane;
	public ch14_04() {
		setTitle("숫자가 아닌 키가 입력되는 경우 경고창 만들기");
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
		
		toolbar.add(new JLabel("학번"));
		toolbar.add(tf);
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				//int code = (int)e.getKeyChar(); //code < 48 || code > 57
				if(e.getKeyChar() < '0' || e.getKeyChar() > '9') {
					e.consume(); //입력한 글 쓴거 무르기
					JOptionPane.showMessageDialog(null , e.getKeyChar()+"는 숫자 키가 아닙니다. \n 숫자를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(toolbar, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new ch14_04();
	}
}
