package javastudy.awt;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TwoListenAdapter{

	private Frame	 frame;
	private TextField textField;
	
	public void go() {

		frame = new Frame("¶à¸ö¼àÌýÆ÷");

		frame.add(new Label("click"), BorderLayout.NORTH);

		textField = new TextField(30);

		frame.add(textField, BorderLayout.SOUTH);

		frame.addMouseListener(new MyAdapter());

		
		frame.addWindowListener(new Mywindow());
		frame.setSize(300, 200);
		frame.setLocation(1000, 0);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		TwoListenAdapter win = new TwoListenAdapter();

		win.go();
	}
}

class MyAdapter extends MouseAdapter{
	
	@Override
	public void mouseDragged(MouseEvent e) {
	
		// TODO Auto-generated method stub
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	
		// TODO Auto-generated method stub
		String str = "the mouse has entered the frame";
		System.out.println(str);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
	
		// TODO Auto-generated method stub
		String str = "the mouse has left the frame";
		System.out.println(str);
	}
}

class Mywindow extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
	
		System.exit(0);
	}
}
