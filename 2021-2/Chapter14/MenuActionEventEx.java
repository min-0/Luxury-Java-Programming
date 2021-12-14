package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuActionEventEx extends JFrame {
	private JLabel imgLabel = new JLabel(); //빈 이미지를 가진 레이블
	public MenuActionEventEx() {
		setTitle("Menu에 Action 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CreatMenu(); // 메뉴 생성, 프레임 삽입
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}

	private void CreatMenu() { // screen 메뉴 생성, screen 메뉴에 4개의 메뉴 아이템 삽입
		JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = { "Load", "Hide", "Reshow", "Exit" };
		JMenu screenMenu = new JMenu("Screen");
		
		//4개의 메뉴아이템을 Screen 메뉴에 삽입한다.
		MenuActionListener listener = new MenuActionListener();
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		// 메뉴바에 메뉴 삽입
		mb.add(screenMenu);
		// 메뉴바를 프레임에 부착
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener { //메뉴아이템 처리 Action 리스너
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //사용자가 선택한 메뉴아이템의 문자열 리턴
			switch(cmd) { //메뉴 아이템의 종류 구분
			case "Load":
				if(imgLabel.getIcon() != null) return; //이미 로딩되었으면 리턴
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
