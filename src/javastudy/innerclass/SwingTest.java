/**
 * 
 */
package javastudy.innerclass;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Nandi Zhou
 *
 */
public class SwingTest {

	public static void main(String[] args) {

		JFrame frame = new JFrame("JFrame");

		JButton button1 = new JButton("click 1");
		JButton button2 = new JButton("click 2");
		/*
		 * ��Ϊͨ����˵���������һ����ťֻ��һ�����ܣ���ʵ������������˵���ͱ�ʾһ����ť��listenerֻ������һ���ط�
		 * �������Ϊ�˵�������һ���࣬�ͱȽ��˷ѡ�
		 * ������Swing�У������ڲ���Ƚϳ���
		 */
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("hello!");
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("world!");
			}
		});

		frame.setSize(200, 200);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);

		//		frame.addWindowListener(new WindowAdapter() {
		//
		//			@Override
		//			public void windowClosing(WindowEvent e) {
		//
		//				super.windowClosing(e);
		//				System.exit(0);
		//			}
		//
		//		});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

		frame.setVisible(true);

	}
}
