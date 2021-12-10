package Chapter14;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame {
	public TabbedPaneEx() {
		setTitle("ÅÇÆÒ ¸¸µé±â ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane(); //ÅÇÆÒÀ» »ý¼ºÇÑ´Ù.
		c.add(pane, BorderLayout.CENTER); // ÅÇÆÒÀ» ÄÁÅÙÆ®ÆÒ¿¡ ºÎÂøÇÑ´Ù.
		setSize(250,250);
		setVisible(true);
	}
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(); //ÅÇÆÒ °´Ã¼¸¦ »ý¼ºÇÑ´Ù.
		pane.addTab("tab1", new JLabel(new ImageIcon("images/red.jpg"))); //Ã¹¹øÂ° ÅÇ
		pane.addTab("tab2", new JLabel(new ImageIcon("images/green.jpg"))); //µÎ¹øÂ° ÅÇ
		pane.addTab("tab3", new MyPanel()); //¼¼¹øÂ° ÅÇ
		
		return pane;
	}
	
	class MyPanel extends JPanel {
		public MyPanel() {
			this.setBackground(Color.yellow);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10,10,50,50);
			g.setColor(Color.blue);
			g.fillOval(10,70,50,50);
			g.setColor(Color.black);
			g.drawString("tab 3¿¡ µé¾î°¡´Â JPanel ÀÔ´Ï´Ù. ", 30, 50);
		}
	}
	
	public static void main(String[] args) {
		new TabbedPaneEx();
	}
}
