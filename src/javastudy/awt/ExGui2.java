package javastudy.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;


public class ExGui2 {

	private Frame frame;

	private Button bn,bs,bw,be,bc;
	
	public void go() {

		frame = new Frame("Border Layout");
		
		be = new Button("East");
		bs = new Button("South");
		bw = new Button("West");
		bn = new Button("North");
		bc = new Button("Center");
		
		frame.add(be, BorderLayout.EAST);
		frame.add(bs, BorderLayout.SOUTH);
		frame.add(bw, BorderLayout.WEST);
		frame.add(bn, BorderLayout.NORTH);
		frame.add(bc, BorderLayout.CENTER);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {

		ExGui2 win = new ExGui2();
		
		win.go();
	}
}
