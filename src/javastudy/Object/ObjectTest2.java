package javastudy.Object;

public class ObjectTest2 {
	
	protected static void output(Object object,Object object2) {
		System.out.println(object == object2);
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		
		Object object = new Object();
		Object object2 = new Object();
		
		output(object,object2);
		
		String str = new String("aaa");
		String str2 = new String("aaa");
		
		output(str,str2);
		
		String str3 = "bbb";
		String str4 = "bbb";
		
		output(str3, str4);
		
		String str5 = new String("ccc");
		String str6 = "ccc";
		
		output(str5, str6);
		
		String s = "hello";
		String s1 = "hel";
		String s2 = "lo";
		
		output(s, s1+s2);
		
		output(s, "hel"+"lo");
		
	}
}
