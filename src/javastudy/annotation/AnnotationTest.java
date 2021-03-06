package javastudy.annotation;

public @interface AnnotationTest {

	/*
	 * 推荐使用名字 value，这样在使用注解时  比较简单
	 * @AnnotationTest(value)
	 * 
	 * 如果不是 value，则
	 * @AnnotationTest(name = fadsdf)
	 */
	String value1() default "hello";

	EnumTest value2();
}

enum EnumTest {
	Hello, World, Welcome
}