/**
 * 
 */
package javastudy.innerclass;

import java.util.Date;

/**
 * 
 * 匿名内部类
 * 
 * @author Nandi Zhou
 *
 */
public class AnonymousInnerClassTest {

	@SuppressWarnings("deprecation")
	public String get(Date d) {

		return d.toLocaleString();
	}

	@SuppressWarnings("serial")
	public static void main(String[] args) {

		AnonymousInnerClassTest test = new AnonymousInnerClassTest();

		/*
		 * 关键就是 大括号 {}，它表示定义了一个继承Date类的 匿名类
		 */
		String str = test.get(new Date() {
		});

		System.out.println(str);
	}
}
