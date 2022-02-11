package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch14_03 extends JFrame {
	private Container contentPane;
	public ch14_03() {
		setTitle("���� ���� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		CreateToolBar();
		setSize(250, 200);
		setVisible(true);
	}
	private void CreateToolBar() {
		JToolBar toolbar = new JToolBar();
		toolbar.setBackground(Color.gray);
		
		JButton btn = new JButton("����");
		toolbar.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(btn, "���� �����Ͻðڽ��ϱ�?", "Message", JOptionPane.YES_NO_OPTION);
				
				if(res == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
		contentPane.add(toolbar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ch14_03();
	}
}
