package javastudy.annotation;

import java.util.Date;

public class DeprecatedTest {
	
	/*
	 * @Deprecated��ʾ���������鱻ʹ��
	 */
	@Deprecated
	public void doSomething() {
		System.out.println("do something");
	}
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
	}
}
