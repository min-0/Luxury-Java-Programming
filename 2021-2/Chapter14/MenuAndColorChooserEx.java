package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAndColorChooserEx extends JFrame {
	private JLabel label = new JLabel("Hello");
	public MenuAndColorChooserEx() {
		setTitle("JColorChooser ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("Text");
		JMenuItem colorMenuItem = new JMenuItem("Color");
		
		colorMenuItem.addActionListener(new MenuActionListener());
		
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //�޴� �������� �̸� ����
			if(cmd.equals("Color")); //Color �޴� �������� ���
			Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);
			
			//��� ��ư�� �����ų� �׳� ���̾�α׸� �ݴ� ��� selectedColor�� null�̴�.
			if(selectedColor != null) label.setForeground(selectedColor);
		}
	}
	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}

}
