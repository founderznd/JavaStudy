package javastudy.jdk5.autoboxing;

public class BoxTest2 {

	public static void main(String[] args) {

		/*
		 * ͨ��Դ�����������֪����Integer���� -128��127֮������������Ѿ������뻺�浱�С�
		 * ���Ե���ֵ����[-128,127]ʱ��Javaֱ�ӵ��û����ڵ���������i1��i2����ͬһ��Object
		 */
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println((i1 == i2) ? "i1 == i2" : "i1 != i2");

		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println((i3 == i4) ? "i3 == i4" : "i3 != i4");

		Integer i5 = -128;
		Integer i6 = -128;
		System.out.println((i5 == i6) ? "i5 == i6" : "i5 != i6");

		Integer i7 = -129;
		Integer i8 = -129;
		System.out.println((i7 == i8) ? "i7 == i8" : "i7 != i8");
	}
}
