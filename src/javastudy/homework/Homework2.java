package javastudy.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/*
 * �������50��������ÿ�����ֵķ�Χ��[10,50] 
 * ͳ��ÿ�����ֳ��ֵĴ����Լ����ִ����������������ĸ���
 * ���ÿ�����ּ�����ִ�����ӡ����
 * ���ĳ�����ֳ��ִ���Ϊ0���򲻴�ӡ�� 
 * ��ӡʱ�������ֵ��������У�Ҫ��ʹ�ü���ʵ�֣�������ʹ�����顣
 */
public class Homework2 {

	public static void output(Map<Integer,Integer> map, Integer max) {

		// print the solution
		Set<Map.Entry<Integer,Integer>> set = map.entrySet();
		List<Integer> list = new ArrayList<Integer>();

		for (Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator(); iterator.hasNext();) {

			Map.Entry<Integer,Integer> entry = iterator.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (value.intValue() == max.intValue()) {
				list.add(key);
			}
			System.out.println(key + " ������ " + value + " �Ρ�");
		}

		System.out.println("������Ϊ��" + max + " �Ρ�");
		System.out.print("�������������У�");
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer in = iterator.next();
			System.out.print(in + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Random rd = new Random();

		// HashMap�޷������е�key����������Ҫkey����˳�����У�ֻ��ʹ��TreeMap��
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>(new MyComparator<Integer>());

		// random 50 numbers in [10,50] and put into Map
		for (int i = 0; i < 50; i++) {

			int num = 10 + rd.nextInt(41);
			System.out.print(num + " ");

			Integer key = new Integer(num);

			if (map.containsKey(key)) {
				Integer in = (Integer)map.get(key);
				map.put(key, new Integer(in.intValue() + 1));
			}
			else {
				map.put(key, new Integer(1));
			}

		}
		System.out.println();

		// ��map�������е�value��ȡ�����ŵ�һ��Collection����
		// Ȼ��ʹ��Collections�����max�������õ����ֵ��
		// Ҫע�����max�������ص���һ��Object���͡�
		Collection<Integer> col = map.values();
		Integer max = Collections.max(col);

		output(map, max);
	}
}

// �Զ���һ��Comparator��ʹ���ִӴ�С���
class MyComparator<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		return ((Integer)o2).compareTo((Integer)o1);
	}
}
