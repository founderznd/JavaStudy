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
 * 随机生成50个整数，每个数字的范围是[10,50] 
 * 统计每个数字出现的次数以及出现次数最多的数字与他的个数
 * 最后将每个数字及其出现次数打印出来
 * 如果某个数字出现次数为0，则不打印。 
 * 打印时按照数字的升序排列，要求使用集合实现，不允许使用数组。
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
			System.out.println(key + " 出现了 " + value + " 次。");
		}

		System.out.println("最大次数为：" + max + " 次。");
		System.out.print("出现最多的数字有：");
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer in = iterator.next();
			System.out.print(in + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Random rd = new Random();

		// HashMap无法对所有的key进行排序，想要key按照顺序排列，只能使用TreeMap。
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

		// 把map里面所有的value提取出来放到一个Collection里面
		// 然后使用Collections里面的max方法，得到最大值。
		// 要注意的是max方法返回的是一个Object类型。
		Collection<Integer> col = map.values();
		Integer max = Collections.max(col);

		output(map, max);
	}
}

// 自定义一个Comparator，使数字从大到小输出
class MyComparator<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		return ((Integer)o2).compareTo((Integer)o1);
	}
}
