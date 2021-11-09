package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboActionEx extends JFrame {
	private String[] names = {"검정", "초록", "빨강"}; //라디오버튼의 문자열
	private ImageIcon [] image = { //이미지 객체 배열
			new ImageIcon("images/call.jpg"),
			new ImageIcon("images/green.jpg"),
			new ImageIcon("images/red.jpg")
	};
	private JLabel imgLabel = new JLabel(image[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(names);
	public ComboActionEx() {
		setTitle("콤보박스 만들기 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		//Action 리스너 등록
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource(); //Action 이벤트가 발생한 콤보박스 알아내기
				int index = cb.getSelectedIndex(); //콤보박스의 선택된 아이템의 인덱스 번호 알아내기
				imgLabel.setIcon(image[index]); //인덱스의 이미지를 이미지 레이블 컴포넌트에 출력
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
