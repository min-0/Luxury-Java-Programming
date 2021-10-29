package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("		Disabled Button		");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.yellow); //배경색 설정
		b1.setForeground(Color.magenta); //글자색 설정
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b1.setEnabled(false); //버튼 비활성화
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + ", " + b.getY()); //타이틀에 버튼 좌표 출력
			}
			
		});
		//컨텐트팬에 버튼 부착
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		setSize(260, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}

}
