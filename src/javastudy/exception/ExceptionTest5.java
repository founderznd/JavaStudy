package javastudy.exception;

public class ExceptionTest5 {

	/*
	 * try����return������ִ��finallyȻ����ִ��return
	 * �����exitʱ������ִ�� exit
	 */
	public void method() {

		try {

			System.out.println("����tryģ��");
			
			//return;
			System.exit(0);;
		}
		catch (Exception e) {
			
			System.out.println("�쳣������");
		}
		finally {

			System.out.println("����finallyģ��");
		}

		System.out.println("�쳣�����������");
	}
	
	public static void main(String[] args) {

		ExceptionTest5 test = new ExceptionTest5();
		
		test.method();
	}
}
