package Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton[] color = new JRadioButton[3]; //라디오버튼 배열
	private String[] names = {"검정", "초록", "빨강"}; //라디오버튼의 문자열
	private ImageIcon [] image = { //이미지 객체 배열
			new ImageIcon("images/call.jpg"),
			new ImageIcon("images/green.jpg"),
			new ImageIcon("images/red.jpg")
	};
	private JLabel imageLabel = new JLabel(); //이미지가 출력될 레이블
	
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); //3개의 라디오버튼을 부착할 패널
		radioPanel.setBackground(Color.gray);
		
		ButtonGroup g = new ButtonGroup(); //버튼 그룹 객체 생성
			for(int i = 0; i < color.length; i++) { //3개의 라디오버튼에 대해
				color[i] = new JRadioButton(names[i]); //라디오버튼 생성
				g.add(color[i]); //버튼 그룹에 부착
				radioPanel.add(color[i]); //패널에 부착
				color[i].addItemListener(new MyItemListener()); //라디오버튼에 아이템 리스너 등록
			}
			color[2].setSelected(true); //빨강 라디오버튼을 선택 상태로 설정
			c.add(radioPanel, BorderLayout.NORTH); //컨텐트팬에 North에 라디오패널 부착
			c.add(imageLabel, BorderLayout.CENTER); //컨텐트팬의 Center에 이미지 레이블 부착
			imageLabel.setHorizontalAlignment(SwingConstants.CENTER); //이미지 중앙 정렬
			
			setSize(500, 300);
			setVisible(true);
	}
	//아이템 리스너 작성
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) return; //해제된 경우 리턴
			
			if(color[0].isSelected()) imageLabel.setIcon(image[0]);
			else if(color[1].isSelected()) imageLabel.setIcon(image[1]);
			else if(color[2].isSelected()) imageLabel.setIcon(image[2]);
			
		}
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

}
