package javastudy.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonTest {

	public static void main(String[] args) {

		Frame frame = new Frame("Test Button");
		frame.setLayout(new FlowLayout());
		
		Button b1 = new Button("press me!");
		Button b2 = new Button("don not press me!");
		
		/*
		 * ����ť����¼�������������ӵĴ�����ͨ����������
		 */
		b1.addActionListener(new Handler());
		b2.addActionListener(new Handler());
		
		frame.add(b1);
		frame.add(b2);
		
		frame.pack();
		frame.setLocation(1000, 0);
		frame.setVisible(true);
	}
}

class Handler implements ActionListener{
	/*
	 * �����ǵ�����ťʱ��java���Զ�����һ��ActionEvent���󡣲���֮���ݸ��¼�������
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String label = e.getActionCommand();
		System.out.println(label);
	}
}
