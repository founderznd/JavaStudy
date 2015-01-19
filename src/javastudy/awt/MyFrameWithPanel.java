package javastudy.awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;


public class MyFrameWithPanel extends Frame {

	
	public MyFrameWithPanel(String title) {

		super(title);
	}
	
	public static void main(String[] args) {

		MyFrameWithPanel frame = new MyFrameWithPanel("frame with panel");
		
		Panel panel = new Panel();
		
		frame.setSize(500, 500);
		frame.setBackground(Color.BLUE);
		frame.setLayout(null);
		
		panel.setSize(200, 200);
		panel.setBackground(Color.CYAN);
		
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
