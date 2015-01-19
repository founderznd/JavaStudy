package javastudy.Object.String;

public class StringTest{
	
	private static void output(Object obj,Object obj2) {
		System.out.println(obj.equals(obj2));
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		
		String str = new String("aa");
		String str2 = new String("aa");
		
		output(str, str2);
		
		String str3 = "aa";
		String str4 = "aa";
		
		output(str3, str4);
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		output(obj, obj2);
		output(obj, obj);
	}
}
