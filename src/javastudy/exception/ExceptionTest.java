package javastudy.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		/*
		 * try��catch����
		 * ��try�������쳣ʱ��������ת��catch��
		 */
		int c = 0;
		try{
			int a = 3;
			int b = 0;
			c = a / b;
			
			System.out.println("hello world");
		}
		/*
		 * ��java�У��쳣Ҳ��һ������
		 * try�е��쳣���浽e��
		 * catch�����ж���������ֻ����һ����ִ��
		 */
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		/*
		 * finally���ǻᱻִ��
		 */
		finally{
			
			System.out.println("welcome");
		}
		
		System.out.println(c);
	}
}
