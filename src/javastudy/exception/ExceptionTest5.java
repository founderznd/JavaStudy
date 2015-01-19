package javastudy.exception;

public class ExceptionTest5 {

	/*
	 * try中有return，会先执行finally然后再执行return
	 * 如果是exit时，会先执行 exit
	 */
	public void method() {

		try {

			System.out.println("进入try模块");
			
			//return;
			System.exit(0);;
		}
		catch (Exception e) {
			
			System.out.println("异常发生了");
		}
		finally {

			System.out.println("进入finally模块");
		}

		System.out.println("异常处理后续代码");
	}
	
	public static void main(String[] args) {

		ExceptionTest5 test = new ExceptionTest5();
		
		test.method();
	}
}
