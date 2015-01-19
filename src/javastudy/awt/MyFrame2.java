package javastudy.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;


public class MyFrame2 {

	public static void main(String[] args) {

		Frame frame = new Frame("My Frame2");
		
		Button button = new Button("click me");
		button.addActionListener(new MyListener());
		
		/*
		 * �رհ�ťĬ���ڿ�����棬����Ҫ������Ӱ�ť��
		 */
		frame.addWindowListener(new MyWindow1());
		frame.add(button);
		
		frame.setSize(500, 500);
		frame.setLocation(1000, 0);
		frame.setVisible(true);
	}
}

/*
 * ���ڴ����¼����������кܶ෽�������붼Ҫʵ��
 */
class MyListener implements ActionListener{
	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
	
		long ms = e.getWhen();
		Date date = new Date(ms);
		System.out.println(date.toLocaleString());
	}
}

class MyWindow1 implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("�رմ���");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {

		// TODO Auto-generated method stub
		System.out.println("�ѹر�");
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
	
}