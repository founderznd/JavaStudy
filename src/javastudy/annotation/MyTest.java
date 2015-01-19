package javastudy.annotation;

@MyAnnotation(hello = "Beijing", world = "Chongqing")
public class MyTest {

	@MyAnnotation(hello = "Shanghai", world = "Tianjin")
	@Deprecated
	public void output() {

		System.out.println("output something");
	}
}
