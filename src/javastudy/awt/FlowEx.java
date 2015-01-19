package javastudy.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;


public class FlowEx {

	private Frame frame;
	
	private Button b1,b2,b3;
	
	public void go() {

		/*
		 * 使用flowlayout替换到默认的borderlayout
		 */
		frame = new Frame("Flow Layout");
		frame.setLayout(new FlowLayout());
		
		b1 = new Button("hello");
		b2 = new Button("world");
		b3 = new Button("welcome");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {

		FlowEx flow = new FlowEx();
		
		flow.go();
	}
}
