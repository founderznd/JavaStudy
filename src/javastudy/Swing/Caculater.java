package javastudy.Swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Caculater implements ActionListener {

	private int				WIDTH  = 250;
	private int				HEIGHT = 300;
	private JFrame			 frame;
	private Panel			  p1;
	private GridBagLayout	  gridbag;
	private GridBagConstraints gbc;
	private JButton			n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, POINT;
	private JButton			ADD, MINE, MUL, DIV, EQ, CLEAR, DEL;
	/*
	 * textField�����Σ�����������������ÿһ������
	 * textField2�����ԣ���ʾ���
	 */
	private JTextField		 textField,textField2;
	private Double			operator1, operator2;
	private String			 operand;
	//�Ƿ��ǵ�һ������
	Boolean IsFirst = true;

	/*
	 * ���ַ��ð�ť����ʽ
	 */
	private void putButton(JButton b, int x, int y) {

		p1.add(b);
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gridbag.setConstraints(b, gbc);
	}

	private void putButton(JButton b, int x, int y, int width, int heigh) {

		p1.add(b);
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = heigh;
		gridbag.setConstraints(b, gbc);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			//�����ּ�ʱ�����浽op1
			if (e.getSource() == n0) {
				textField.setText(textField.getText() + "0");
				textField2.setText(textField2.getText() + "0");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n1) {
				textField.setText(textField.getText() + "1");
				textField2.setText(textField2.getText() + "1");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n2) {
				textField.setText(textField.getText() + "2");
				textField2.setText(textField2.getText() + "2");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n3) {
				textField.setText(textField.getText() + "3");
				textField2.setText(textField2.getText() + "3");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n4) {
				textField.setText(textField.getText() + "4");
				textField2.setText(textField2.getText() + "4");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n5) {
				textField.setText(textField.getText() + "5");
				textField2.setText(textField2.getText() + "5");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n6) {
				textField.setText(textField.getText() + "6");
				textField2.setText(textField2.getText() + "6");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n7) {
				textField.setText(textField.getText() + "7");
				textField2.setText(textField2.getText() + "7");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n8) {
				textField.setText(textField.getText() + "8");
				textField2.setText(textField2.getText() + "8");
				operator1 = Double.parseDouble(textField.getText());
			}
			if (e.getSource() == n9) {
				textField.setText(textField.getText() + "9");
				textField2.setText(textField2.getText() + "9");
				operator1 = Double.parseDouble(textField.getText());
			}
			//��С����ʱ��Ҫ���ǵ�С����ֻ�ܰ�һ�Ρ�
			if (e.getSource() == POINT) {
				if (!textField.getText().contains(".")) {					
					textField.setText(textField.getText() + ".");
					textField2.setText(textField2.getText() + ".");
				}
			}
			//��"+"��ʱ,��op1ת�Ƶ�op2��������operand
			if (e.getSource() == ADD) {
				if (IsFirst) {					
					operator2 = operator1;
				}
				textField.setText("");
				textField2.setText(textField2.getText() + "+");
				operand = e.getActionCommand();
			}
			//��"-"��ʱ
			if (e.getSource() == MINE) {
				if (IsFirst) {					
					operator2 = operator1;
				}
				textField.setText("");
				textField2.setText(textField2.getText() + "-");
				operand = e.getActionCommand();
			}
			//��"*"��ʱ
			if (e.getSource() == MUL) {
				if (IsFirst) {					
					operator2 = operator1;
				}
				textField.setText("");
				textField2.setText(textField2.getText() + "*");
				operand = e.getActionCommand();
			}
			//��"/"��ʱ
			if (e.getSource() == DIV) {
				if (IsFirst) {					
					operator2 = operator1;
				}
				textField.setText("");
				textField2.setText(textField2.getText() + "/");
				operand = e.getActionCommand();
			}
			//��"="��ʱ������ǰ�ı�ת�������ֺ󣬱��浽op2��Ȼ�����operand�����㡣
			if (e.getSource() == EQ) {
				if ("+" == operand) {
					operator2 = operator2 + operator1;
					//����
					if (operator2.intValue() == operator2) {
						int res = operator2.intValue();
						textField.setText(String.valueOf(res));
						textField2.setText(String.valueOf(res));
					}
					//������
					else {							
						textField.setText(operator2.toString());
						textField2.setText(operator2.toString());
					}
				}
				if ("-" == operand) {
					operator2 = operator2 - operator1;
					if (operator2.intValue() == operator2) {
						int res = operator2.intValue();
						textField.setText(String.valueOf(res));
						textField2.setText(String.valueOf(res));
					}
					else {							
						textField.setText(operator2.toString());
						textField2.setText(operator2.toString());
					}
				}
				if ("*" == operand) {
					operator2 = operator2 * operator1;
					if (operator2.intValue() == operator2) {
						int res = operator2.intValue();
						textField.setText(String.valueOf(res));
						textField2.setText(String.valueOf(res));
					}
					else {							
						textField.setText(operator2.toString());
						textField2.setText(operator2.toString());
					}
				}
				if ("/" == operand) {
					//��������Ϊ0
					if (0 == operator1.intValue()) {
						textField2.setText("��������Ϊ0");
						textField.setText("");
						operand = "";
						operator1 = 0.0;
						operator2 = 0.0;
						IsFirst = true;
					}
					else{
						operator2 = operator2 / operator1;
						if (operator2.intValue() == operator2) {
							int res = operator2.intValue();
							textField.setText(String.valueOf(res));
							textField2.setText(String.valueOf(res));
						}
						else {							
							textField.setText(operator2.toString());
							textField2.setText(operator2.toString());
						}
					}
				}
				IsFirst = false;
			}
			//��clearʱ
			if (e.getSource() == CLEAR) {
				textField.setText("");
				textField2.setText("");
				operand = "";
				operator1 = 0.0;
				operator2 = 0.0;
				IsFirst = true;
			}
			//��delʱ
			if (e.getSource() == DEL) {
				textField2.setText(textField2.getText(0, textField2.getText().length()-1));
				textField.setText(textField.getText(0, textField.getText().length()-1));
				operator1 = Double.parseDouble(textField.getText());
			}
		}
		catch (Exception e2) {

		}

	}

	public void go() {

		/*
		 * �ı���
		 */
		textField = new JTextField(30);
		textField2 = new JTextField(30);
		/*
		 * ���ɰ�ť
		 */
		n1 = new JButton("1");
		n2 = new JButton("2");
		n3 = new JButton("3");
		n4 = new JButton("4");
		n5 = new JButton("5");
		n6 = new JButton("6");
		n7 = new JButton("7");
		n8 = new JButton("8");
		n9 = new JButton("9");
		n0 = new JButton("0");
		POINT = new JButton(".");
		ADD = new JButton("+");
		MINE = new JButton("-");
		MUL = new JButton("*");
		DIV = new JButton("/");
		EQ = new JButton("=");
		CLEAR = new JButton("C");
		DEL = new JButton("Del");

		/*
		 * pandel with GridBagLayout
		 */
		gridbag = new GridBagLayout();
		p1 = new Panel(gridbag);

		/*
		 * ����ÿ����ť�����λ�ã��ص�
		 */
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(2, 2, 2, 2);
		gbc.weighty = 1;

		// �ı���
		p1.add(textField2);
		textField2.setHorizontalAlignment(JTextField.RIGHT);// ���ֿ���
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(textField2, gbc);

		// ��ť��
		putButton(n7, 0, 1);
		putButton(n8, 1, 1);
		putButton(n9, 2, 1);
		putButton(DIV, 3, 1);
		putButton(CLEAR, 4, 1);

		putButton(n4, 0, 2);
		putButton(n5, 1, 2);
		putButton(n6, 2, 2);
		putButton(MUL, 3, 2);
		putButton(DEL, 4, 2);

		putButton(n1, 0, 3);
		putButton(n2, 1, 3);
		putButton(n3, 2, 3);
		putButton(MINE, 3, 3);
		putButton(EQ, 4, 3, 1, 2);

		putButton(n0, 0, 4, 2, 1);
		putButton(POINT, 2, 4);
		putButton(ADD, 3, 4);

		frame = new JFrame("My First Calc");
		frame.add(p1);
		/*
		 * ����¼�
		 */
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		n0.addActionListener(this);
		POINT.addActionListener(this);
		ADD.addActionListener(this);
		MINE.addActionListener(this);
		MUL.addActionListener(this);
		DIV.addActionListener(this);
		EQ.addActionListener(this);
		CLEAR.addActionListener(this);
		DEL.addActionListener(this);

		frame.setResizable(false);
		// frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		Caculater calc = new Caculater();
		calc.go();
	}
}
