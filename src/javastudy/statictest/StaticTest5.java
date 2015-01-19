package javastudy.statictest;
class W {
	
	static int a = 10;

	public static void change() {
		a++;
	}
}

public class StaticTest5 {
	
	public static void main(String[] args) {
		
		W.change();
		System.out.println(W.a);
		
	}
}
