package javastudy.Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class TopLevelDemo {

	public static void main(String[] args) {

		JFrame frame = new JFrame("TopLevelDemo");

		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});

		JLabel label = new JLabel("hello");

		label.setBackground(Color.YELLOW);
		label.setPreferredSize(new Dimension(200, 180));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.CYAN);
		menuBar.setPreferredSize(new Dimension(200, 20));

		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(label, BorderLayout.CENTER);

		frame.setLocation(1000, 0);
		frame.pack();
		frame.setVisible(true);
	}
}
