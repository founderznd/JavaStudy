package javastudy.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuTest {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Menu");
		
		JMenuBar mb = new JMenuBar();
		
		JMenu m1 = new JMenu("M1");
		JMenu m2 = new JMenu("M2");
		JMenu m3 = new JMenu("M3");
		JMenu m4 = new JMenu("M4");
		
		JMenuItem i1 = new JMenuItem("item1");
		JMenuItem i2 = new JMenuItem("item2");
		JMenuItem i3 = new JMenuItem("item3");
		JMenuItem i4 = new JMenuItem("item4");
		JMenuItem i5 = new JMenuItem("item5");
		
		i1.addActionListener(new MyAction());
		
		frame.setJMenuBar(mb);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		
		/*
		 * Swing提供简便的方法可以直接关闭窗口
		 * 这样就不用每次调用addWindowListener
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(1000, 0);
		frame.setSize(200, 300);
		frame.setVisible(true);
	}
}

class MyAction implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	
		System.exit(0);
	}
}
