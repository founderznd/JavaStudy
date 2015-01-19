package javastudy.annotation;

public class MyDocumentedTest {

	@MyDocumented("welcome")
	public void method() {
		
		System.out.println("hello world");
	}
}
