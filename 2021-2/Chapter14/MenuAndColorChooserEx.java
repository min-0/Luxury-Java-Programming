package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAndColorChooserEx extends JFrame {
	private JLabel label = new JLabel("Hello");
	public MenuAndColorChooserEx() {
		setTitle("JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("Text");
		JMenuItem colorMenuItem = new JMenuItem("Color");
		
		colorMenuItem.addActionListener(new MenuActionListener());
		
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //메뉴 아이템의 이름 리턴
			if(cmd.equals("Color")); //Color 메뉴 아이템의 경우
			Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);
			
			//취소 버튼을 누르거나 그냥 다이얼로그를 닫는 경우 selectedColor는 null이다.
			if(selectedColor != null) label.setForeground(selectedColor);
		}
	}
	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}

}
