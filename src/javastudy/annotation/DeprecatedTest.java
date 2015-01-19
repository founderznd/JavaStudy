package javastudy.annotation;

import java.util.Date;

public class DeprecatedTest {
	
	/*
	 * @Deprecated表示方法不建议被使用
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
