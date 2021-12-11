package Chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolTipEx extends JFrame {
	private Container contentPane;
	public ToolTipEx() {
		setTitle("툴바 만들기 예제");
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
		newBtn.setToolTipText("파일을 생성합니다."); //New 버튼에 툴팁 달기
		bar.add(newBtn);
		
		JButton openBtn = new JButton("Open");
		openBtn.setToolTipText("파일을 엽니다."); //Open 버튼에 툴팁 달기
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton("Save");
		saveBtn.setToolTipText("파일을 저장합니다."); //Save 버튼에 툴팁 달기
		bar.add(saveBtn);
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요."); //텍스트필드에 툴팁 달기
		bar.add(tf);
		contentPane.add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolTipEx();
	}

}
