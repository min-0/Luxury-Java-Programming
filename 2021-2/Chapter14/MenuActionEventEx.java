package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuActionEventEx extends JFrame {
	private JLabel imgLabel = new JLabel(); //�� �̹����� ���� ���̺�
	public MenuActionEventEx() {
		setTitle("Menu�� Action ������ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CreatMenu(); // �޴� ����, ������ ����
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}

	private void CreatMenu() { // screen �޴� ����, screen �޴��� 4���� �޴� ������ ����
		JMenuBar mb = new JMenuBar(); // �޴��� ����
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = { "Load", "Hide", "Reshow", "Exit" };
		JMenu screenMenu = new JMenu("Screen");
		
		//4���� �޴��������� Screen �޴��� �����Ѵ�.
		MenuActionListener listener = new MenuActionListener();
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		// �޴��ٿ� �޴� ����
		mb.add(screenMenu);
		// �޴��ٸ� �����ӿ� ����
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener { //�޴������� ó�� Action ������
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //����ڰ� ������ �޴��������� ���ڿ� ����
			switch(cmd) { //�޴� �������� ���� ����
			case "Load":
				if(imgLabel.getIcon() != null) return; //�̹� �ε��Ǿ����� ����
				imgLabel.setIcon(new ImageIcon("images/heart.jpg"));
				break;
			case "Hide":
				imgLabel.setVisible(false);
				break;
			case "Reshow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}
	public static void main(String[] args) {
		new MenuActionEventEx();
	}

}
