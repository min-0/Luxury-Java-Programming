package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_01 extends JFrame {
	public ch14_01() {
		setTitle("�޴� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CreateMenu();
		setSize(250, 200);
		setVisible(true);
	}
	private void CreateMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu file = new JMenu("����");
		JMenu edit = new JMenu("����");
		JMenu show = new JMenu("����");
		JMenu input = new JMenu("�Է�");
		
		JMenuItem closer = new JMenuItem("ȭ��Ȯ��");
		JMenuItem line = new JMenuItem("������");
		
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
