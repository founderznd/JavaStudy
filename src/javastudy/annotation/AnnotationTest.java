package javastudy.annotation;

public @interface AnnotationTest {

	/*
	 * �Ƽ�ʹ������ value��������ʹ��ע��ʱ  �Ƚϼ�
	 * @AnnotationTest(value)
	 * 
	 * ������� value����
	 * @AnnotationTest(name = fadsdf)
	 */
	String value1() default "hello";

	EnumTest value2();
}

enum EnumTest {
	Hello, World, Welcome
}