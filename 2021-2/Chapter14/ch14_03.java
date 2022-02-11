package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_03 extends JFrame {
	private Container contentPane;
	public ch14_03() {
		setTitle("종료 툴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		CreateToolBar();
		setSize(250, 200);
		setVisible(true);
	}
	private void CreateToolBar() {
		JToolBar toolbar = new JToolBar();
		toolbar.setBackground(Color.gray);
		
		JButton btn = new JButton("종료");
		toolbar.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(btn, "정말 종료하시겠습니까?", "Message", JOptionPane.YES_NO_OPTION);
				
				if(res == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
		contentPane.add(toolbar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ch14_03();
	}
}
