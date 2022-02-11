package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_01 extends JFrame {
	public ch14_01() {
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CreateMenu();
		setSize(250, 200);
		setVisible(true);
	}
	private void CreateMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu file = new JMenu("파일");
		JMenu edit = new JMenu("편집");
		JMenu show = new JMenu("보기");
		JMenu input = new JMenu("입력");
		
		JMenuItem closer = new JMenuItem("화면확대");
		JMenuItem line = new JMenuItem("쪽윤곽");
		
		mb.add(file);
		mb.add(edit);
		mb.add(show);
		mb.add(input);
		
		show.add(closer);
		show.add(line);
		
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new ch14_01();
	}
}
