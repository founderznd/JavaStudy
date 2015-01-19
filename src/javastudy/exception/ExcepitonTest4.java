package javastudy.exception;

public class ExcepitonTest4 {

	public void method(String str) throws Exception {
		
		if (null == str) {
			
			throw new MyException("传入的字符不能为null");
		}
		else if ("hello".equals(str)) {
			
			throw new MyException2("传入的字符串不能为hello");
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
			
			System.out.println("进入MyException");
			e.printStackTrace();
		}
		catch (MyException2 e) {
			
			System.out.println("进入MyException2");
			e.printStackTrace();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			
			System.out.println("异常处理完毕");
		}
		System.out.println("程序执行完毕");
	}
}
