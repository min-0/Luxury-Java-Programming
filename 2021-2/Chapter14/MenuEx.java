package Chapter14;

import javax.swing.*;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CreatMenu(); //메뉴 생성, 프레임 삽입
		
		setSize(250, 200);
		setVisible(true);
	}
	private void CreatMenu() {
		JMenuBar mb = new JMenuBar(); //메뉴바 생성
		JMenu screenMenu = new JMenu("Screen"); //screen 메뉴 생성
		
		//screen 메뉴에 메뉴 아이템 생성 삽입
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator(); //분리선 삽입
		screenMenu.add(new JMenuItem("Exit"));
		
		//메뉴바에 메뉴 삽입
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		//메뉴바를 프레임에 부착
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuEx();
	}

}
