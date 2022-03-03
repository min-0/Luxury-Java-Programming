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
		setTitle("����� ���� �ߴ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(lb);
        setSize(300,150);
        setVisible(true);
        
        playAudio("audio\\�ֱ���1��.wav");
        lb.setText("audio\\�ֱ���1��.wav ���� ��");
        
        c.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(MouseEvent e) {
        		lb.setText("audio\\�ֱ���1��.wav ���� ���");
        		clip.start();
        	}
        	public void mouseExited(MouseEvent e) {
        		lb.setText("audio\\�ֱ���1��.wav ���� �Ͻ� �ߴ�");
        		clip.stop();
        	}
        });
	}
	private void playAudio(String pathName) {
		try {
			File audioFile = new File(pathName); // ����� ������ ��θ�
			audioStream = AudioSystem.getAudioInputStream(audioFile); // ����� ���Ϸκ���
			
			clip = AudioSystem.getClip(); // ����ִ� ����� Ŭ�� �����
			clip.open(audioStream); // ����� ����� ��Ʈ�� ����
			clip.start(); // ��� ����
		}
		catch (LineUnavailableException e) { e.printStackTrace(); }
		catch (UnsupportedAudioFileException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
	}

	public static void main(String[] args) {
		new ch14_05();
	}

}
