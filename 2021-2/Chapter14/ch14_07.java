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
	private JLabel lb = new JLabel("����� ������ �����ϼ���");

	public ch14_07() {
		setTitle("����� ������ ã�� ����/���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		JMenuBar mb = new JMenuBar();
		JMenu audio = new JMenu("�����");
		JMenuItem start = new JMenuItem("����");
		JMenuItem exit = new JMenuItem("����");
		
		mb.add(audio);
		audio.add(start);
		audio.add(exit);
		setJMenuBar(mb);
		
		c.add(lb);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = chooseFile();
				if(filePath == null)
					return; // ������ ���õ��� �ʾ���
				
				if(clip != null && clip.isActive()) //���ֵǰ� ���� ��
					clip.close(); //���� ���ֵǰ� �ִ� ����� ����

				playAudio(filePath);
				lb.setText(new File(filePath).getName() + " �� �����ϰ� �ֽ��ϴ�.");
			}
		});
		exit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(clip != null && clip.isActive()) {
						clip.close();
						lb.setText("���ָ� �����մϴ�.");		
				}
			}
		});
		setSize(400, 150);
		setVisible(true);
	}
	private String chooseFile() {
		if(chooser == null) // ó���̸�, �ƴϸ� ������ ���� chooser �̿�
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
		new ch14_07();
	}
}
