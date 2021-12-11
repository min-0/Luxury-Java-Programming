package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		//다이얼로그 ok 버튼에 Action 리스너 달기
		//ok 버튼이 선택되면 다이얼로그가 화면에서 사라지게 한다.
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //다이얼로그를 보이지 않게 한다.
			}
		});
	}
}

public class DialogEx extends JFrame {
	private MyDialog dialog; //다이얼로그의 레퍼런스
	public DialogEx() {
		super("DialogEx");
		
		//다이얼로그 생성
		dialog = new MyDialog(this, "Test Dialog");
		JButton btn = new JButton("Show Dialog");
		
		//버튼이 선택되면 다이얼로그를 작동시킨다.
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); //다이얼로그를 출력하고 작동시킨다.
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx();
	}

}
