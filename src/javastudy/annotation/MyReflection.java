package javastudy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {

	public static void main(String[] args) throws Exception {

		MyTest mytest = new MyTest();

		Class<MyTest> c = MyTest.class;

		Method method = c.getDeclaredMethod("output", new Class[] {});

		/*
		 * isAnnotationPresent
		 */
		if (method.isAnnotationPresent(MyAnnotation.class)) {

			method.invoke(mytest, new Object[] {});

			MyAnnotation myAnnotation = method
					.getAnnotation(MyAnnotation.class);

			String hello = myAnnotation.hello();
			String world = myAnnotation.world();

			System.out.println(hello + ',' + world);
		}
		
		/*
		 * getAnnotation
		 */
		Annotation[] annotations = method.getAnnotations();
		
		for (Annotation annotation : annotations) {
			
			System.out.println(annotation.annotationType().getName());
		}

	}
}
