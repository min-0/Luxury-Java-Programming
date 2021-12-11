package Chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame {
	private Container contentPane;
	public ToolBarEx() {
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		CreatToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	private void CreatToolBar() {
		//���� ����
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.gray);
		
		//���ٿ� �޴��� ����� ������Ʈ�� �����Ѵ�.
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
		
		//���ٸ� ���������� North�� �����Ѵ�.
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ToolBarEx();
	}
}
