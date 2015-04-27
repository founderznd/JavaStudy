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
		 * 关闭按钮默认在框架里面，不需要额外添加按钮。
		 */
		frame.addWindowListener(new MyWindow1());
		frame.add(button);

		frame.setSize(500, 500);
		frame.setLocation(1000, 0);
		frame.setVisible(true);
	}
}

/*
 * 对于窗口事件处理器，有很多方法，必须都要实现
 */
class MyListener implements ActionListener {

	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {

		long ms = e.getWhen();
		Date date = new Date(ms);
		System.out.println(date.toLocaleString());
	}
}

class MyWindow1 implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("关闭窗口");
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {

		System.out.println("已关闭");
	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}