package Chapter7;

import java.util.*; //해시맵 사용을 위한 import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ch7_08 extends JFrame {
	private HashMap<String, Integer> map = new HashMap<>(); //해시맵 선언
	public ch7_08() {
		setTitle("포인트 관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10)); 
		//배치관리자를 FlowLayout으로 설정, 가운데 정렬하고 좌우간격 100, 상하간격 10으로 설정

		JLabel title = new JLabel("** 포인트 관리 프로그램입니다 **");
		c.add(title);
		
		JButton btn = new JButton("포인트 적립 하기"); //포인트 적립할 수 있는 다이얼로그 버튼
		btn.setBackground(Color.pink); //버튼 색을 pink로 설정
		btn.setSize(30, 50);
		c.add(btn);
		
		JLabel list = new JLabel("포인트 현황"); //고객의 이름과 포인트를 출력할 레이블
		c.add(list);
		
		btn.addActionListener(new ActionListener() { //버튼에 대한 ActionListner 등록
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("이름과 포인트 입력"); //입력할 수 있는 다이얼로그 생성
				
	            if(input.equals("그만")) System.exit(0); //텍스트창에 "그만"이라고 입력할 경우 프로그램 종료

	            String arr[] = input.split(" "); //공백을 기준으로 문자열을 잘라 배열 arr에 저장
	            list.setText(""); //레이블 초기화 다시 그리기 위함

	            Integer name = map.get(arr[0]); //배열 0번째는 고객 이름(point와 같은 타입으로)
	            Integer point = Integer.parseInt(arr[1]); //배열 1번째는 포인트 수
	            if(name != null) point += name; //이름이 null이 아닐 때  맵에서 해당 이름을 찾아 포인트 추가
	            map.put(arr[0], point); //맵에 포인트 추가
	            
	            Iterator<String> keys = map.keySet().iterator(); 
	            while(keys.hasNext()) {
	                String key = keys.next();
	                list.setText(list.getText() + "(" + key + ", " +  map.get(key) + ")");
	            }
			}
		});
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ch7_08();
	}
}
