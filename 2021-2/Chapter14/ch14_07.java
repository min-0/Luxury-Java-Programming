package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.filechooser.*;

public class ch14_07 extends JFrame {
	private JFileChooser chooser = null;
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	private JLabel lb = new JLabel("오디오 파일을 선택하세요");

	public ch14_07() {
		setTitle("오디오 파일을 찾아 연주/종료 제어");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		JMenuBar mb = new JMenuBar();
		JMenu audio = new JMenu("오디오");
		JMenuItem start = new JMenuItem("연주");
		JMenuItem exit = new JMenuItem("종료");
		
		mb.add(audio);
		audio.add(start);
		audio.add(exit);
		setJMenuBar(mb);
		
		c.add(lb);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = chooseFile();
				if(filePath == null)
					return; // 파일이 선택되지 않았음
				
				if(clip != null && clip.isActive()) //연주되고 있을 때
					clip.close(); //현재 연주되고 있는 오디오 정지

				playAudio(filePath);
				lb.setText(new File(filePath).getName() + " 를 연주하고 있습니다.");
			}
		});
		exit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(clip != null && clip.isActive()) {
						clip.close();
						lb.setText("연주를 종료합니다.");		
				}
			}
		});
		setSize(400, 150);
		setVisible(true);
	}
	private String chooseFile() {
		if(chooser == null) // 처음이면, 아니면 이전에 만든 chooser 이용
			chooser= new JFileChooser();
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Audio Files(wav, au, mid, rmf)", "wav", "au", "mid",  "rmf");
	    chooser.setFileFilter(filter);
		int ret = chooser.showOpenDialog(ch14_07.this);
		if(ret != JFileChooser.APPROVE_OPTION) return null;
		String filePath = chooser.getSelectedFile().getPath();
		return filePath;
	}
	
	private void playAudio(String pathName) {
		try {
			File audioFile = new File(pathName); // 오디오 파일의 경로명
			audioStream = AudioSystem.getAudioInputStream(audioFile); // 오디오 파일로부터
			
			clip = AudioSystem.getClip(); // 비어있는 오디오 클립 만들기
			clip.open(audioStream); // 재생할 오디오 스트림 열기
			clip.start(); // 재생 시작
		}
		catch (LineUnavailableException e) { e.printStackTrace(); }
		catch (UnsupportedAudioFileException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
	}

	public static void main(String[] args) {
		new ch14_07();
	}
}
