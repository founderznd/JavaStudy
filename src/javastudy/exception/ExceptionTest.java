package javastudy.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		/*
		 * try和catch搭配
		 * 当try当中有异常时，程序跳转到catch中
		 */
		int c = 0;
		try{
			int a = 3;
			int b = 0;
			c = a / b;
			
			System.out.println("hello world");
		}
		/*
		 * 在java中，异常也是一个对象
		 * try中的异常保存到e中
		 * catch可以有多个，但最多只能有一个被执行
		 */
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		/*
		 * finally总是会被执行
		 */
		finally{
			
			System.out.println("welcome");
		}
		
		System.out.println(c);
	}
}
