package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		//���̾�α� ok ��ư�� Action ������ �ޱ�
		//ok ��ư�� ���õǸ� ���̾�αװ� ȭ�鿡�� ������� �Ѵ�.
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //���̾�α׸� ������ �ʰ� �Ѵ�.
			}
		});
	}
}

public class DialogEx extends JFrame {
	private MyDialog dialog; //���̾�α��� ���۷���
	public DialogEx() {
		super("DialogEx");
		
		//���̾�α� ����
		dialog = new MyDialog(this, "Test Dialog");
		JButton btn = new JButton("Show Dialog");
		
		//��ư�� ���õǸ� ���̾�α׸� �۵���Ų��.
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); //���̾�α׸� ����ϰ� �۵���Ų��.
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx();
	}

}
