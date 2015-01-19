package javastudy.reflect;

import java.lang.reflect.Array;

public class ArrayTester2 {

	public static void main(String[] args) {
		
		int[] dims = new int[] {5,10,15};

		//Integer.TYPE���ص���int,��Integer.class���ص���Integer������Ӧ��class����
		// System.out.println(Integer.TYPE);
		// System.out.println(Integer.class);
		
		//����һ��int���͵�array��ά����dims������������ǳ����Ϊ5��10��15����ά���顣
		Object array = Array.newInstance(Integer.TYPE, dims);
		//Object array = Array.newInstance(int.class, dims);
		
		//���һ����ά���飬����array�����ά����ĵ�3��ƽ�棨10��15��
		Object arrayObj = Array.get(array, 3);
		
		//�õ�arrazObj����Ӧ��ComponentType
		// Class<?> classtype = arrayObj.getClass().getComponentType();
		// System.out.println(classtype);
		
		//���һ��һά���飬����arrayObj�ĵ�5�У�1��15��
		arrayObj = Array.get(arrayObj, 5);
		
		//������ĵ�10��Ԫ�ظ�ֵΪ37
		Array.setInt(arrayObj, 10, 37);
		
		int[][][] arrayCast = (int[][][]) array;
		
		System.out.println(arrayCast[3][5][10]);
	}
}
