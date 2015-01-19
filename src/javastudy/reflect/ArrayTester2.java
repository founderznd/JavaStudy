package javastudy.reflect;

import java.lang.reflect.Array;

public class ArrayTester2 {

	public static void main(String[] args) {
		
		int[] dims = new int[] {5,10,15};

		//Integer.TYPE返回的是int,而Integer.class返回的是Integer类所对应的class对象
		// System.out.println(Integer.TYPE);
		// System.out.println(Integer.class);
		
		//创建一个int类型的array，维度由dims决定，这里就是长宽高为5，10，15的三维数组。
		Object array = Array.newInstance(Integer.TYPE, dims);
		//Object array = Array.newInstance(int.class, dims);
		
		//获得一个二维数组，它是array这个三维数组的第3个平面（10×15）
		Object arrayObj = Array.get(array, 3);
		
		//得到arrazObj所对应的ComponentType
		// Class<?> classtype = arrayObj.getClass().getComponentType();
		// System.out.println(classtype);
		
		//获得一个一维数组，它是arrayObj的第5行（1×15）
		arrayObj = Array.get(arrayObj, 5);
		
		//将数组的第10个元素赋值为37
		Array.setInt(arrayObj, 10, 37);
		
		int[][][] arrayCast = (int[][][]) array;
		
		System.out.println(arrayCast[3][5][10]);
	}
}
