package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.*;

public class ch14_05 extends JFrame {
	private JLabel lb = new JLabel();
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	public ch14_05() {
		setTitle("오디오 시작 중단 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(lb);
        setSize(300,150);
        setVisible(true);
        
        playAudio("audio\\애국가1절.wav");
        lb.setText("audio\\애국가1절.wav 연주 중");
        
        c.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(MouseEvent e) {
        		lb.setText("audio\\애국가1절.wav 연주 계속");
        		clip.start();
        	}
        	public void mouseExited(MouseEvent e) {
        		lb.setText("audio\\애국가1절.wav 연주 일시 중단");
        		clip.stop();
        	}
        });
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
		new ch14_05();
	}

}
