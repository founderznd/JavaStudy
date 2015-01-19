package javastudy.jdk5.autoboxing;

public class BoxTest2 {

	public static void main(String[] args) {

		/*
		 * 通过源代码分析可以知道，Integer当中 -128到127之间的整数，是已经被存入缓存当中。
		 * 所以当赋值介于[-128,127]时，Java直接调用缓存内的数。所以i1和i2都是同一个Object
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
