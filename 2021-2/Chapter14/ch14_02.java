package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class ch14_02 extends JFrame {
	private ImageIcon icon = null;
	private Image image = null;
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); //메뉴바 생성
		JMenu fileMenu = new JMenu("파일"); //파일 메뉴 생성
		JMenuItem open = new JMenuItem("열기"); //파일 메뉴에 열기 메뉴아이템 생성 삽입
		
		mb.add(fileMenu); //메뉴바에 파일 메뉴 삽입
		fileMenu.add(open); //파일 메뉴에 열기 아이템 삽입
		setJMenuBar(mb); //메뉴바를 프레임에 부착
		open.addActionListener(new OpenActionListener());
	}
	public ch14_02() {
		setTitle("메뉴로 배경 이미지 로딩하기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel mp = new MyPanel();
		setContentPane(mp);
		createMenu();
		
		setSize(400,400);
		setVisible(true);
	}
	class OpenActionListener implements ActionListener { //메뉴 아이템 처리 Action 리스너
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser(); //파일 다이얼로그 생성
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", //파일 이름난에 출력될 문자열
					"jpg"); //파일 필터로 사용되는 확장자. *.jpg만 나열됨
			chooser.setFileFilter(filter); //파일 다이얼로그에 파일 필터 설정
			
			int ret = chooser.showOpenDialog(null); //파일 다이얼로그 출력
			
			if(ret != JFileChooser.APPROVE_OPTION) { //사용자가 창을 강제로 닫았거나 취소 버튼을 누른 경우
				JOptionPane.showMessageDialog(null,  "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			//사용자가 파일을 선택하고 "열기"버튼을 누른 경우
			String filePath = chooser.getSelectedFile().getPath(); //파일 경로명 리턴
			icon = new ImageIcon(filePath+"/"); 
			image = icon.getImage();
			
			repaint();
		}
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0,0,getWidth(), getHeight(),this);
		}
	}
	public static void main(String[] args) {
		new ch14_02();
	}
}
