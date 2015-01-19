package javastudy.annotation;

@AnnotationTest(value2 = EnumTest.Welcome)
public class AnnotationUsageTest {

	@AnnotationTest(value1 = "world", value2 = EnumTest.Hello)
	public void method() {

		System.out.println("usage of annotation");
	}

	public static void main(String[] args) {

		AnnotationUsageTest test = new AnnotationUsageTest();

		test.method();
	}
}
