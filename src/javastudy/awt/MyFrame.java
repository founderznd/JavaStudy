package javastudy.awt;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame {

	public MyFrame(String title) {

		super(title);
	}
	
	public static void main(String[] args) {

		MyFrame frame1 = new MyFrame("First GUI app");
				
		frame1.setSize(500, 500);
		frame1.setBackground(Color.GREEN);
		
		frame1.setVisible(true);
	}
}
