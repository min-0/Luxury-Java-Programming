package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class ch14_02 extends JFrame {
	private ImageIcon icon = null;
	private Image image = null;
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); //�޴��� ����
		JMenu fileMenu = new JMenu("����"); //���� �޴� ����
		JMenuItem open = new JMenuItem("����"); //���� �޴��� ���� �޴������� ���� ����
		
		mb.add(fileMenu); //�޴��ٿ� ���� �޴� ����
		fileMenu.add(open); //���� �޴��� ���� ������ ����
		setJMenuBar(mb); //�޴��ٸ� �����ӿ� ����
		open.addActionListener(new OpenActionListener());
	}
	public ch14_02() {
		setTitle("�޴��� ��� �̹��� �ε��ϱ� ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel mp = new MyPanel();
		setContentPane(mp);
		createMenu();
		
		setSize(400,400);
		setVisible(true);
	}
	class OpenActionListener implements ActionListener { //�޴� ������ ó�� Action ������
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser(); //���� ���̾�α� ����
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", //���� �̸����� ��µ� ���ڿ�
					"jpg"); //���� ���ͷ� ���Ǵ� Ȯ����. *.jpg�� ������
			chooser.setFileFilter(filter); //���� ���̾�α׿� ���� ���� ����
			
			int ret = chooser.showOpenDialog(null); //���� ���̾�α� ���
			
			if(ret != JFileChooser.APPROVE_OPTION) { //����ڰ� â�� ������ �ݾҰų� ��� ��ư�� ���� ���
				JOptionPane.showMessageDialog(null,  "������ �������� �ʾҽ��ϴ�.", "���", JOptionPane.WARNING_MESSAGE);
				return;
			}
			//����ڰ� ������ �����ϰ� "����"��ư�� ���� ���
			String filePath = chooser.getSelectedFile().getPath(); //���� ��θ� ����
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
