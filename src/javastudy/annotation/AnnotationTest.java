package javastudy.annotation;

public @interface AnnotationTest {

	/*
	 * �Ƽ�ʹ������ value��������ʹ��ע��ʱ  �Ƚϼ�
	 * @AnnotationTest(XXX)
	 * 
	 * ������� value����
	 * @AnnotationTest(name = XXX)
	 */
	String value1() default "hello" ;
	EnumTest value2();
}

enum EnumTest{
	Hello,World,Welcome
}