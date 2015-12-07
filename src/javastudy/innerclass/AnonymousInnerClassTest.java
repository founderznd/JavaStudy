/**
 * 
 */
package javastudy.innerclass;

import java.util.Date;

/**
 * 
 * �����ڲ���
 * 
 * @author Nandi Zhou
 *
 */
public class AnonymousInnerClassTest {

	@SuppressWarnings("deprecation")
	public String get(Date d) {

		return d.toLocaleString();
	}

	public static void main(String[] args) {

		AnonymousInnerClassTest test = new AnonymousInnerClassTest();

		/*
		 * �ؼ����� ������ {}������ʾ������һ���̳�Date��� ������
		 */
		String str = test.get(new Date() {
		});

		System.out.println(str);
	}
}
