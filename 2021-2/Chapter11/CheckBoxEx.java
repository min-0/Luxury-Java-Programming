package Chapter11;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//이미지 체크박스에 사용할 2개의 이미지 객체 생성
		ImageIcon green = new ImageIcon("images/green.jpg"); //해제 상태 이미지
		ImageIcon selectedred = new ImageIcon("images/red.jpg"); //선택 상태 이미지
		
		//3개의 체크박스 생성
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox call = new JCheckBox("수신", green);
		
		call.setBorderPainted(true);
		call.setSelectedIcon(selectedred);
		
		//컨텐트 팬에 3개의 체크박스 부착
		c.add(apple);
		c.add(pear);
		c.add(call);
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
