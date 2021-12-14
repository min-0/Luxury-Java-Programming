package Chapter14;

import javax.swing.*;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CreatMenu(); //�޴� ����, ������ ����
		
		setSize(250, 200);
		setVisible(true);
	}
	private void CreatMenu() {
		JMenuBar mb = new JMenuBar(); //�޴��� ����
		JMenu screenMenu = new JMenu("Screen"); //screen �޴� ����
		
		//screen �޴��� �޴� ������ ���� ����
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator(); //�и��� ����
		screenMenu.add(new JMenuItem("Exit"));
		
		//�޴��ٿ� �޴� ����
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		//�޴��ٸ� �����ӿ� ����
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuEx();
	}

}
