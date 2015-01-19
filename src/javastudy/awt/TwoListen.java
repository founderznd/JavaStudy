package javastudy.awt;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class TwoListen implements MouseListener,MouseMotionListener,WindowListener{

	private Frame frame;
	private TextField textField;
	
	@Override
	public void windowOpened(WindowEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {

		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		// TODO Auto-generated method stub
		String str = "x: " + e.getX() + ", y: " + e.getY();
		this.textField.setText(str);
	}

	@Override
	public void mouseMoved(MouseEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		// TODO Auto-generated method stub
		String str = "the mouse has entered the frame";
		this.textField.setText(str);		
	}

	@Override
	public void mouseExited(MouseEvent e) {

		// TODO Auto-generated method stub
		String str = "the mouse has left the frame";
		this.textField.setText(str);
	}

	public void go() {

		frame = new Frame("多个监听器");
		
		frame.add(new Label("click"),BorderLayout.NORTH);
		
		textField = new TextField(30);
		
		frame.add(textField,BorderLayout.SOUTH);
		
		frame.addMouseMotionListener(this);
		
		/*
		 * 同一个按钮可以同时添加多个不同的事件监听器
		 * 它们同时作用
		 */
		frame.addMouseListener(this);
		frame.addMouseListener(new MyMouseListener());
		
		frame.addWindowListener(this);
		
		frame.setSize(300, 200);
		frame.setLocation(1000, 0);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {

		TwoListen win = new TwoListen();
		
		win.go();
	}
}

class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		// TODO Auto-generated method stub
		System.out.println("the mouse has entered the frame");	
	}

	@Override
	public void mouseExited(MouseEvent e) {

		// TODO Auto-generated method stub
		System.out.println("the mouse has left the frame");
	}
}