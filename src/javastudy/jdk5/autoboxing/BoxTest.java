package javastudy.jdk5.autoboxing;

import java.util.ArrayList;
import java.util.Collection;
/*
 * �Զ�װ��Ͳ���
 */

public class BoxTest {

	public static void main(String[] args) {

		int a = 3;

		Collection<Integer> e = new ArrayList<Integer>();
		
		e.add(3);//��int���͵�3�Զ�ת��ΪInteger���Ͳ��ŵ����ϵ��С�
		
		e.add(a + 3);
		
		for (Integer i : e) {
			System.out.println(i);
		}
	}
}
