package javastudy.statictest;
public class StaticTest {
	public static void main(String[] args) {

		MyStatic.a = 10;

		System.out.println(MyStatic.a);
	}
}

class MyStatic {
	static int a;
}
