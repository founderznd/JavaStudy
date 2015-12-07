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
		 * 因为通常来说，软件当中一个按钮只有一个功能，落实到程序上面来说，就表示一个按钮的listener只会用在一个地方
		 * 所以如果为此单独定义一个类，就比较浪费。
		 * 所以在Swing中，匿名内部类比较常见
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
