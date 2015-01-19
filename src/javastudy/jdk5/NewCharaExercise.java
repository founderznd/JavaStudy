package javastudy.jdk5;

import java.util.HashMap;
import java.util.Set;

public class NewCharaExercise {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		/*
		 * 3行代码，用到了  自动装箱，拆箱，还有新的for循环
		 */
		for (String word : args) {
			map.put(word, (null == map.get(word) ? 1 : map.get(word) + 1));
		}

		System.out.println(map);

		Set<String> set = map.keySet();
		for (String string : set) {
			Integer in = map.get(string);
			System.out.println(string + " = " + in);
		}
	}
}
