package javastudy.exception;

public class ExcepitonTest4 {

	public void method(String str) throws Exception {
		
		if (null == str) {
			
			throw new MyException("������ַ�����Ϊnull");
		}
		else if ("hello".equals(str)) {
			
			throw new MyException2("������ַ�������Ϊhello");
		}
		else{
			
			System.out.println(str);
		}
	}
	
	public static void main(String[] args){
		
		ExcepitonTest4 test = new ExcepitonTest4();

		try {
			test.method(null);
		} 
		catch (MyException e) {
			
			System.out.println("����MyException");
			e.printStackTrace();
		}
		catch (MyException2 e) {
			
			System.out.println("����MyException2");
			e.printStackTrace();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			
			System.out.println("�쳣�������");
		}
		System.out.println("����ִ�����");
	}
}
