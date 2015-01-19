package javastudy.exception;

/*
 * 空指针异常，最常见的异常
 */
public class ExceptionTest3 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String str = null;
		
		System.out.println(str.length());
	}
}
