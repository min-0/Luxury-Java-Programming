package Chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolTipEx extends JFrame {
	private Container contentPane;
	public ToolTipEx() {
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		CreatToolBar();
		setSize(400, 150);
		setVisible(true);
	}
	
	private void CreatToolBar() {
		JToolBar bar = new JToolBar("Kitae Menu");
		bar.setBackground(Color.gray);
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�."); //New ��ư�� ���� �ޱ�
		bar.add(newBtn);
		
		JButton openBtn = new JButton("Open");
		openBtn.setToolTipText("������ ���ϴ�."); //Open ��ư�� ���� �ޱ�
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton("Save");
		saveBtn.setToolTipText("������ �����մϴ�."); //Save ��ư�� ���� �ޱ�
		bar.add(saveBtn);
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���."); //�ؽ�Ʈ�ʵ忡 ���� �ޱ�
		bar.add(tf);
		contentPane.add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolTipEx();
	}

}
