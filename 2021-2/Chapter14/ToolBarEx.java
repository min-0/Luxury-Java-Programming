package Chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame {
	private Container contentPane;
	public ToolBarEx() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		CreatToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	private void CreatToolBar() {
		//툴바 생성
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.gray);
		
		//툴바에 메뉴로 사용할 컴포넌트를 삽입한다.
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/bubble.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/bubble.jpg")));
		toolBar.add(new JButton("Search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox <String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		//툴바를 컨텐츠팬의 North에 부착한다.
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ToolBarEx();
	}
}
