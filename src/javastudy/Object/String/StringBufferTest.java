package javastudy.Object.String;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();
		buffer.append("hello").append(" world").append(" welcome");
		System.out.println(buffer.toString());
		
		int n = buffer.length();
		buffer.append(100).append(false);
		int m = buffer.length();
		System.out.println(buffer.toString());
		
		buffer.delete(n, m);
		String result = buffer.toString();
		System.out.println(result);

		String s = "abc";
		int a = 100;
		boolean b = true;

		String str = s + a + b;

		System.out.println(str);
		System.out.println("/*************************/");

		m = 100;
		n = 200;

		System.out.println("100 " + 200);
		System.out.println("/*************************/");
		System.out.println("true " + false);

	}
}
