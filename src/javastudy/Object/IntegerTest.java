package javastudy.Object;

public class IntegerTest {
	public static void main(String[] args) {
		
		int a = 10;
		Integer integer = new Integer(a);
		
		String s = "19880330";
		Integer integer2 = new Integer(s);
	
		System.out.println(integer.intValue() == a);
		System.out.println(integer2.intValue());
		
	}	
}
