package javastudy.Swing;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameDemo {

	public static void main(String[] args) {

		JFrame frame = new JFrame("FrameDemo");
		JLabel label = new JLabel("hello");
		
		frame.getContentPane().add(label,BorderLayout.CENTER);
		
		frame.addWindowListener(new MyHandler());
		frame.setLocation(1000, 0);
		frame.pack();
		frame.setVisible(true);
	}
}

class MyHandler extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {

		System.exit(0);
	}
}
